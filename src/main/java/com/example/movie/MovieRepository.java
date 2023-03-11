package com.example.movie;
import java.util.*;
import com.example.movie.Movie;

public interface MovieRepository{
    ArrayList<Movie> getMovies();
    Movie getMovie(int movieId);
    Movie addMovie(Movie movie);
    Movie updateMovie(int movieId, Movie book);
    void deleteMovie(int movieId);
}