package com.reviewpot.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class AlreadyExistenceException extends RuntimeException {

  private String message;

  public AlreadyExistenceException() {
    this.message = ("AlreadyExistenceException Records.");
  }

  @Override
  public String getMessage() {
    return message;
  }

}
