package com.reviewpot.exceptions;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
@RequiredArgsConstructor
@Slf4j
public class GlobalExceptionHandler {

//  private final LogServErrorRepository logServErrorRepository;
//
//  @ExceptionHandler(Exception.class)
//  public void handleException(Exception ex) throws Exception {
//    List<Class> ignores = Lists.newArrayList(
//        AccessDeniedException.class,
//        NotFoundException.class,
//        ClientAbortException.class
//    );
//
//    if (!ignores.contains(ex.getClass())) {
//      logServErrorRepository.save(new LogServError(ex));
//    }
//    throw ex;
//  }
}
