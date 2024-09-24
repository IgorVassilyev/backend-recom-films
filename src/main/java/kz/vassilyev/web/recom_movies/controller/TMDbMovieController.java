package kz.vassilyev.web.recom_movies.controller;

import kz.vassilyev.web.recom_movies.model.response.MovieResponse;
import kz.vassilyev.web.recom_movies.service.TMDbService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TMDbMovieController {
    private final TMDbService tmdbService;

    public TMDbMovieController(TMDbService tmdbService) {
        this.tmdbService = tmdbService;
    }

    @GetMapping("/movies")
    public MovieResponse getMovie() {
        return tmdbService.getMovieDetails();
    }
}
