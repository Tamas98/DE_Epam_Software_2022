package org.example.model;

import java.util.List;
import java.util.Objects;

public class Movie {

    private String title;
    private List<String> directors;
    private int year;
    private int rating;
    private List<String> genres;

    public Movie(String title, List<String> directors, int year, int rating, List<String> genres) {
        this.title = title;
        this.directors = directors;
        this.year = year;
        this.rating = rating;
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getDirectors() {
        return directors;
    }

    public void setDirectors(List<String> directors) {
        this.directors = directors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return year == movie.year && rating == movie.rating && Objects.equals(title, movie.title) && Objects.equals(directors, movie.directors) && Objects.equals(genres, movie.genres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, directors, year, rating, genres);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", directors=" + directors +
                ", year=" + year +
                ", rating=" + rating +
                ", genres=" + genres +
                '}';
    }
}
