import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Movie {
    String title;
    Genre genre;
    int runtime;
    LocalDateTime releaseDate;
    LocalDateTime endDate;
    AgeLimit ageLimit;
}
