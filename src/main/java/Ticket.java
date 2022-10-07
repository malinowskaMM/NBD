import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.Getter;

import java.util.UUID;

@Getter
@Entity
public class Ticket {

    @Id
    @Column(name = "TICKET_UUID" )
    UUID uuid;

    @Column(name = "basePrice")
    double basePrice;

    @JoinColumn(name = "SEAT_UUID")
    UUID seatUuid;

    @JoinColumn(name = "TICKET_TYPE_UUID")
    UUID ticketTypeUuid;

    @JoinColumn(name = "PERFORMANCE_UUID")
    UUID performanceUuid;
}
