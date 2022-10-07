import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
public class Hall {

    @Id
    @Column(name = "HALL_UUID")
    UUID uuid;

    @NotNull
    @Column(name = "SEATS_NUMBER")
    int seatsNumber;

    @NotNull
    @Column(name = "SEATS_IN_ROW")
    int seatsInRow;
}
