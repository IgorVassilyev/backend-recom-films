package kz.vassilyev.web.recom_movies.repository;

import kz.vassilyev.web.recom_movies.model.UserMovie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<UserMovie, Long> {
}
