package kz.vassilyev.web.recom_movies.model.response;

import kz.vassilyev.web.recom_movies.model.Movie;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MovieResponse {
    private int page;
    private List<Movie> results;
}
