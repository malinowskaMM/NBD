package pl.nbd.cinema.movie;

import com.sun.istack.NotNull;
import jakarta.persistence.*;
import lombok.Getter;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Entity
public class Movie {

    @Id
    @NotNull
    @Column(name = "MOVIE_UUID")
    UUID uuid;

    @NotNull
    @Column(name = "TITLE")
    String title;

    @Enumerated(EnumType.ORDINAL)
    @NotNull
    @Column(name = "GENRE")
    Genre genre;

    @Column(name = "RUNTIME")
    @NotNull
    int runtime;

    @Column(name = "RELEASE_DATE")
    @NotNull
    LocalDateTime releaseDate;

    @Column(name = "END_DATE")
    @NotNull
    LocalDateTime endDate;

    @Enumerated(EnumType.ORDINAL)
    @NotNull
    @Column(name = "AGE_TIMIT")
    AgeLimit ageLimit;
}
