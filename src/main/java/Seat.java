import lombok.Getter;

import java.util.UUID;

@Getter
public class Seat {
    UUID uuid;
    int number;
    char row;
}
