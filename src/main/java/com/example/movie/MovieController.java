package com.example.movie;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class MovieController{
    MovieService movieService=new MovieService();
    @GetMapping("/movies")
    public ArrayList<Movie> getMovies(){
        return movieService.getMovies();
    }
    @GetMapping("/movies/{movieId}")
    public Movie getMovie(@PathVariable("movieId") int movieId){
        return movieService.getMovie(movieId);
    }
    @PostMapping("/movies")
    public Movie addMovie(@RequestBody Movie movie){
        return movieService.addMovie(movie);
    }
    @PutMapping("/movies/{movieId}")
    public Movie updateMovie(@PathVariable("movieId") int movieId,@RequestBody Movie movie){
        return movieService.updateMovie(movieId, movie);
    }

    @DeleteMapping("/movies/{movieId}")
    public void DeleteMovie(@PathVariable("movieId")int movieId){
        movieService.deleteMovie(movieId);
    }

}
