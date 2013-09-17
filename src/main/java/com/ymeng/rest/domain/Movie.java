package com.ymeng.rest.domain;

public class Movie {

    private final String name;
    private final String director;

    public Movie(String name, String director) {
        this.name = name;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }
}
