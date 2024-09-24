package kz.vassilyev.web.recom_movies.service;

import kz.vassilyev.web.recom_movies.model.Movie;
import kz.vassilyev.web.recom_movies.model.response.MovieResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TMDbService {

    private final RestTemplate restTemplate;

    @Value("${tmdb.api.key}")
    private String apiKey;

    public TMDbService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public MovieResponse getMovieDetails() {
        String url = String.format("https://api.themoviedb.org/3/discover/movie?include_adult=false&include_video=false&language=en-US&page=1&sort_by=popularity.desc&api_key=%s", apiKey);
        return restTemplate.getForObject(url, MovieResponse.class);
    }
}
