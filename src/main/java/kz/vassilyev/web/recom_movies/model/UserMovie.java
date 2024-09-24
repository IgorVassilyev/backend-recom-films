package kz.vassilyev.web.recom_movies.model;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "movies")
@Getter
@Setter
@EqualsAndHashCode
public class UserMovie {
    @Id
    private Long id;
    private String title;
    @Column(name = "release_date")
    private String releaseDate;
    @Column(name = "genre_ids")
    private List<Integer> genreIds;


    @OneToMany(mappedBy = "movie")
    private Set<UserRating> ratings;

    @OneToMany(mappedBy = "movie")
    private Set<UserReview> reviews;

    @OneToMany(mappedBy = "movie")
    private Set<UserWatchHistory> watchHistory;

    @OneToMany(mappedBy = "movie")
    private Set<UserFavorite> favorites;
}
