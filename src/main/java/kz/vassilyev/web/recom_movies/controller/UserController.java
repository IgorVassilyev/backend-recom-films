package kz.vassilyev.web.recom_movies.controller;

import kz.vassilyev.web.recom_movies.model.User;
import kz.vassilyev.web.recom_movies.model.response.MovieResponse;
import kz.vassilyev.web.recom_movies.service.TMDbService;
import kz.vassilyev.web.recom_movies.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getMovie() {
        return userService.getAllUsers();
    }
}
