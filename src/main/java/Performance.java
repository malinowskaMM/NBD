import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
public class Performance {

    @Id
    UUID uuid;

    @NotNull
    @Column(name = "START_TIME")
    LocalDateTime startTime;

    @NotNull
    @Column(name = "END_TIME")
    LocalDateTime endTime;

    @NotNull
    @JoinColumn(name = "HALL_UUID")
    UUID hallUuid;

    @NotNull
    @JoinColumn(name = "MOVIE_UUID")
    UUID movieUuid;
}
