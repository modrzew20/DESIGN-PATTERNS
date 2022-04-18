package chain_of_responsibility;

import java.time.LocalDate;

public class Rent {

    Client c;
    Room r;
    LocalDate checkin;
    LocalDate checkout;

    public Rent(Client c, Room r, LocalDate checkin, LocalDate checkout) {
        this.c = c;
        this.r = r;
        this.checkin = checkin;
        this.checkout = checkout;
    }
}
