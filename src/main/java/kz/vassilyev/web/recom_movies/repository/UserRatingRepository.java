package kz.vassilyev.web.recom_movies.repository;

import kz.vassilyev.web.recom_movies.model.UserRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRatingRepository extends JpaRepository<UserRating, Long> {
}
