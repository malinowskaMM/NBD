import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Entity
public class Seat {

    @Id
    @NotNull
    @Column(name = "SEAT_UUID")
    UUID uuid;

    @NotNull
    @Column(name = "ROW")
    char row;

    @NotNull
    @Column(name = "NUMBER")
    int number;

}
