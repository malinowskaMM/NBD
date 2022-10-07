import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Performance {
    UUID uuid;
    LocalDateTime startTime;
    LocalDateTime endTime;
    double basePrice;
    Hall hall;
    Movie movie;
}
