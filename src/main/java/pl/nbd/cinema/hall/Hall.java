package pl.nbd.cinema.hall;

import com.sun.istack.NotNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

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
