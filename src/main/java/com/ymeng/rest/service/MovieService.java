package com.ymeng.rest.service;

import com.ymeng.rest.domain.Movie;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MovieService {

    private static final Map<Integer, Movie> allMovies = new HashMap<Integer, Movie>();

    static {
        allMovies.put(1, new Movie("Iron Man", "Jon Favreau"));
        allMovies.put(2, new Movie("Spider Man", "Sam Raimi"));
        allMovies.put(3, new Movie("Inception", "Christopher Nolan"));
    }

    public Movie getMovie(int id) {
        return allMovies.get(id);
    }

}
