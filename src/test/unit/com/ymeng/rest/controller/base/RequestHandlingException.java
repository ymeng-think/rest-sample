package com.ymeng.rest.controller.base;

public class RequestHandlingException extends RuntimeException {

    public RequestHandlingException(Throwable source) {
        super("Request handling exception", source);
    }
}
