package com.reviewpot.api.storage.dto;

import lombok.Getter;
import lombok.Setter;

import java.nio.file.Path;

@Getter
@Setter
public class FileSummary {

    private String contentType;
    private String name;
    private Long size;
    private Path path;

}