package kz.vassilyev.web.recom_movies.repository;

import kz.vassilyev.web.recom_movies.model.UserFavorite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserFavoriteRepository extends JpaRepository<UserFavorite, Long> {
}
