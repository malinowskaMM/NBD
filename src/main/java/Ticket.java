import lombok.Getter;

import java.util.UUID;

@Getter
public class Ticket {
    UUID uuid;
    double basePrice;
    Seat seat;
    TicketType ticketType;
    Performance performance;
}
