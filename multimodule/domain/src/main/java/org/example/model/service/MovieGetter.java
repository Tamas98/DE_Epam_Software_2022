package org.example.model.service;

import org.example.model.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieGetter {

    private final List<Movie> movieList = Arrays.asList(
            new Movie("Halloween", Arrays.asList("David Gordon Green"), 2018, 7, Arrays.asList("Horror")),
            new Movie("Friday the 13th", Arrays.asList("Sean S. Cunningham"), 1980, 7, Arrays.asList("Horror")),
            new Movie("Star Wars: Episode 3 - Revenge of the Sith", Arrays.asList("George Lucas"), 2005, 7, Arrays.asList("Action","Adventure","Fantasy")),
            new Movie("Star Wars: Episode 1 - The Phantom Menace", Arrays.asList("George Lucas"), 1999, 6, Arrays.asList("Action","Adventure","Fantasy"))
    );

    public final List<Movie> getMovieList() {
        return movieList;
    }
}
