package app;

import org.example.movie.MoviePrinterService;
import org.example.movie.MovieSearcherService;

/**
 * TODO docme.
 */
public class Main {

    private static final MovieSearcherService movieSearcherService = new MovieSearcherService();
    private static final MoviePrinterService moviePrinterService = new MoviePrinterService();


    public static void main(String[] args) {
        moviePrinterService.printMovies(movieSearcherService.searchMovie("War"));
        System.out.println("------------------");
        moviePrinterService.printMovieTitles();

    }
}
