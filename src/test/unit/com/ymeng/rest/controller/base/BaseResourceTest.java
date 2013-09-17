package com.ymeng.rest.controller.base;

import org.junit.Before;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;

import javax.servlet.http.HttpServletRequest;

public class BaseResourceTest {

    private AnnotationMethodHandlerAdapter handler;
    private MockHttpServletResponse response;

    @Before
    public void setUp() {
        handler = new AnnotationMethodHandlerAdapter();
        response = new MockHttpServletResponse();
    }

    protected void handle(HttpServletRequest request, Object controller) {
        try {
            handler.handle(request, response, controller);
        } catch (Exception e) {
            throw new RequestHandlingException(e);
        }
    }

    protected MockHttpServletResponse response() {
        return response;
    }
}
