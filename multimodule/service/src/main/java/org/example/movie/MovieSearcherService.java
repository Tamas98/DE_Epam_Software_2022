package org.example.movie;

import org.example.model.Movie;
import org.example.model.service.MovieGetter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MovieSearcherService {
    private final MovieGetter movieGetter = new MovieGetter();

    public List<Movie> searchMovie(String keyword) {
    //    return movieGetter.getMovieList().stream().filter(movie -> movie.getTitle().contains(keyword)).collect(Collectors.toList());
        List<Movie> result = new ArrayList<>();
        for(Movie movie: movieGetter.getMovieList()) {
            if(movie.getTitle().contains(keyword)) {
                result.add(movie);
            }
        }

        return result;
    }
}
