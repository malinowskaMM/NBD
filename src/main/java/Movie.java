import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class Movie {
    UUID uuid;
    String title;
    Genre genre;
    int runtime;
    LocalDateTime releaseDate;
    LocalDateTime endDate;
    AgeLimit ageLimit;
}
