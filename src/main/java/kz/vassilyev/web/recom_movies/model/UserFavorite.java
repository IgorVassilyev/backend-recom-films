package kz.vassilyev.web.recom_movies.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "user_favorites")
@Getter
@Setter
@EqualsAndHashCode
public class UserFavorite {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private UserMovie movie;

    @Column(name = "added_at")
    private Timestamp addedAt;
}
