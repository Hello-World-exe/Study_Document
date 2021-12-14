package com.reviewpot.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.METHOD_NOT_ALLOWED)
public class LimitException extends Exception {

    private String message;

    public LimitException() {
        this.message = ("Quantity exceeded");
    }

    @Override
    public String getMessage() {
        return message;
    }


}
