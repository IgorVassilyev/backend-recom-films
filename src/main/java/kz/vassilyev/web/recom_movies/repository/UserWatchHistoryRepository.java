package kz.vassilyev.web.recom_movies.repository;

import kz.vassilyev.web.recom_movies.model.UserWatchHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserWatchHistoryRepository extends JpaRepository<UserWatchHistory, Long> {
}
