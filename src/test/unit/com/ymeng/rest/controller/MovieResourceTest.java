package com.ymeng.rest.controller;

import com.ymeng.rest.controller.base.BaseResourceTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.servlet.http.HttpServletRequest;

import static com.ymeng.rest.controller.base.HttpRequestBuilder.get;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.http.MediaType.TEXT_PLAIN;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/context.xml")
public class MovieResourceTest extends BaseResourceTest {

    @Autowired
    private MovieResource resource;

    @Test
    public void should_get_movie_name() throws Exception {
        HttpServletRequest request = get("/movies/1").contentType(TEXT_PLAIN).acceptType(APPLICATION_JSON).build();

        handle(request, resource);

        assertThat(response().getStatus(), is(OK.value()));
    }

}
