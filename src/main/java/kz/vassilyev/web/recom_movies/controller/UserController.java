package kz.vassilyev.web.recom_movies.controller;

import kz.vassilyev.web.recom_movies.model.User;
import kz.vassilyev.web.recom_movies.model.response.MovieResponse;
import kz.vassilyev.web.recom_movies.service.TMDbService;
import kz.vassilyev.web.recom_movies.service.UserService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/users/{id}")
    public User getById(@PathVariable int id) {
        return userService.getById(id);
    }

    @PostMapping("/users")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable Long id) {
        userService.deleteById(id);
    }

    @PutMapping("/users")
    public User update(@RequestBody User user) {
        return userService.update(user);
    }
}
