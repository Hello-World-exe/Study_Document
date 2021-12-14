package com.reviewpot.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {

    private String message;

    public NotFoundException() {
        this.message = ("Not found Records.");
    }

    public NotFoundException(String message) {
        this.message = message;
    }

    public NotFoundException(String message, Boolean isDefault) {
        if (isDefault)
            this.message = message + "가(이) 존재하지 않습니다.";
        else
            this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}