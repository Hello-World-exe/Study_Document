package com.reviewpot.api.apps.common.dto;


import com.reviewpot.api.contants.OrderType;
import com.reviewpot.api.jpa.base.DomainWithMapper;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.util.Streamable;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class PagableDto<R> {

    @Data
    public static class Request {

        @ApiModelProperty(value = "페이지", example = "0", required = false, position = 1)
        private int page = 0;

        @ApiModelProperty(value = "페이지 당 수", example = "20", required = false, position = 2)
        private int limit = 20;

        @ApiModelProperty(value = "정렬필드", example = "createdAt", required = false, position = 3)
        private String sort;

        @ApiModelProperty(value = "정렬방식", example = "DESC", required = false, position = 4)
        private OrderType order;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    public static class Response<T> implements Streamable<T> {

        @ApiModelProperty(value = "총갯수")
        private Long totalElements;

        @ApiModelProperty(value = "페이지당 개수")
        private Integer size;

        @ApiModelProperty(value = "페이지 번호")
        private Integer pageIndex;

        private List<T> content;

        public static ModelMapper mapper;

        @Override
        public Iterator<T> iterator() {
            return content.iterator();
        }

        public static <X, Y extends DomainWithMapper> Response<X> of(Page<Y> page) {
            Response result = new Response<>();
            result.setTotalElements(page.getTotalElements());
            result.setPageIndex(page.getNumber());
            result.setSize(page.getSize());
            result.setContent(
                    page.getContent()
                            .stream()
                            .map(v -> v.toResponse())
                            .collect(Collectors.toList())
            );

            return result;
        }

        public static <X, Y, Z> Response<X> of(Page<Y> page, List<Z> content) {
            Response result = new Response<>();
            result.setTotalElements(page.getTotalElements());
            result.setPageIndex(page.getNumber());
            result.setSize(page.getSize());
            result.setContent(content);

            return result;
        }

        public static <X, Y, Z> Response<X> of(Page<Y> page, List<Z> content, PageRequest p) {
            Response result = new Response<>();
            result.setTotalElements(page.getTotalElements());
            result.setPageIndex(p.getPageNumber());
            result.setSize(p.getPageSize());
            result.setContent(content);

            return result;
        }

        public static <X, Z> Response<X> ofs(long totalElements, List<Z> content, PageRequest p) {
            Response result = new Response<>();
            result.setTotalElements(totalElements);
            result.setPageIndex(p.getPageNumber());
            result.setSize(p.getPageSize());
            result.setContent(content);

            return result;
        }
//
    public static <X> Response<X> setResponsePage(Page<X> page) {
      Response result = new Response<>();
      result.setTotalElements(page.getTotalElements());
      result.setPageIndex(page.getNumber());
      result.setSize(page.getSize());
      result.setContent(page.stream().collect(Collectors.toList()));
      return result;
    }
    }
}
