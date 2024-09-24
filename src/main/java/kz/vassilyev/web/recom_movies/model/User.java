package kz.vassilyev.web.recom_movies.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;


@Entity
@Table(name = "users")
@Getter
@Setter
@EqualsAndHashCode
public class User {
    @Id
    private Long id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "user")
    private Set<UserRating> ratings;

    @OneToMany(mappedBy = "user")
    private Set<UserReview> reviews;

    @OneToMany(mappedBy = "user")
    private Set<UserWatchHistory> watchHistory;

    @OneToMany(mappedBy = "user")
    private Set<UserFavorite> favorites;
}
