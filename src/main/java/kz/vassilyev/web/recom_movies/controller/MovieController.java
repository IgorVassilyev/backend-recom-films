package kz.vassilyev.web.recom_movies.controller;

import kz.vassilyev.web.recom_movies.model.Movie;
import kz.vassilyev.web.recom_movies.model.response.MovieResponse;
import kz.vassilyev.web.recom_movies.service.TMDbService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    private final TMDbService tmdbService;

    public MovieController(TMDbService tmdbService) {
        this.tmdbService = tmdbService;
    }

    @GetMapping("/movies")
    public MovieResponse getMovie() {
        return tmdbService.getMovieDetails();
    }
}
