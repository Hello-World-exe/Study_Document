package com.reviewpot.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class NotMatchException extends Exception {

  private String message;

  public NotMatchException(String message) {
    this.message = message;
  }

  @Override
  public String getMessage() {
    return message;
  }
}
