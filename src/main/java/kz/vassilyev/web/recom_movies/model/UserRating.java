package kz.vassilyev.web.recom_movies.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "user_ratings")
@Getter
@Setter
@EqualsAndHashCode
public class UserRating {
    @Id
    private Long id;


    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private UserMovie movie;


    private Double rating;
    @Column(name = "created_at")
    private Timestamp createdAt;
}
