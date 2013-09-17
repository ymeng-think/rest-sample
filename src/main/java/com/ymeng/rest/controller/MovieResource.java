package com.ymeng.rest.controller;

import com.ymeng.rest.controller.exception.ResourceNotFoundException;
import com.ymeng.rest.domain.Movie;
import com.ymeng.rest.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/movies")
public class MovieResource {

    @Autowired
    private MovieService service;

    @RequestMapping(value = "/{id}", method = GET)
    @ResponseBody
    public String getName(@PathVariable int id) {
        Movie movie = service.getMovie(id);
        if (movie == null) {
            throw new ResourceNotFoundException();
        }

        return movie.getName();
    }
}
