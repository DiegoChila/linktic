package com.linktic.testlinktic.domain.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class CustomHttpException extends Exception {

    private HttpStatus httpStatus;

    public CustomHttpException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
