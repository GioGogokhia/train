package by.issoft.domain.users;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @Test
    void getTicket() {
        Passenger passenger1 = new Passenger(UUID.randomUUID(), "Armin", "Arlert", 15, 45);
        assertEquals(45, passenger1.getTicket());
    }
}