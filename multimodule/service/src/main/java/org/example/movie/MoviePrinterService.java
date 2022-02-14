package org.example.movie;

import org.example.model.Movie;
import org.example.model.service.MovieGetter;

import java.util.List;

public class MoviePrinterService {
    private final MovieGetter movieGetter = new MovieGetter();

    public void printMovies(List<Movie> movieList) {
        movieList.stream().map(Movie::getTitle).forEach(System.out::println);
    }

    public void printMovieTitles() {
        movieGetter.getMovieList().stream().map(Movie::getTitle).forEach(System.out::println);
    }

}
