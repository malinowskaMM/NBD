import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
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
    AgeLimit ageLimit;
}
