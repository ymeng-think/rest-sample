package com.ymeng.rest.controller.base;

import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

public class HttpRequestBuilder {

    private final MockHttpServletRequest request;

    private HttpRequestBuilder() {
        request = new MockHttpServletRequest();
    }

    public static HttpRequestBuilder get(String uri) {
        return new HttpRequestBuilder().method(GET).uri(uri);
    }

    public HttpRequestBuilder contentType(MediaType mediaType) {
        request.setContentType(mediaType.toString());
        return this;
    }

    public HttpRequestBuilder acceptType(MediaType mediaType) {
        request.addHeader("Accept", mediaType.toString());
        return this;
    }

    public HttpServletRequest build() {
        return request;
    }

    private HttpRequestBuilder method(RequestMethod method) {
        request.setMethod(method.toString());
        return this;
    }

    private HttpRequestBuilder uri(String uri) {
        request.setRequestURI(uri);
        return this;
    }
}
