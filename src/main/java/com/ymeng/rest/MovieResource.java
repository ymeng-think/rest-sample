package com.ymeng.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/movies")
public class MovieResource {

    @RequestMapping(value = "/{id}", method = GET)
    public @ResponseBody String getName(@PathVariable String id) {
        return "abc";
    }
}
