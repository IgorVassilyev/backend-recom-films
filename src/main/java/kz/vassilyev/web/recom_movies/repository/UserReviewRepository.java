package kz.vassilyev.web.recom_movies.repository;

import kz.vassilyev.web.recom_movies.model.UserReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReviewRepository extends JpaRepository<UserReview, Long> {
}
