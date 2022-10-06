import lombok.Getter;

@Getter
public class Ticket {
    double basePrice;
    Seat seat;
    TicketType ticketType;
    Performance performance;
}
