package com.reviewpot.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class ConflictException extends RuntimeException {

  private String message;

  public ConflictException(String message) {
    this.message = message;
  }

  @Override
  public String getMessage() {
    return message;
  }

}
