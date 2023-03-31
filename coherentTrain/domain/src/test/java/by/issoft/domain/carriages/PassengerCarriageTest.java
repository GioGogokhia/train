package by.issoft.domain.carriages;

import by.issoft.domain.Cargo;
import by.issoft.domain.users.Passenger;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class PassengerCarriageTest {

    @Test
    void addPassenger() throws Exception {
        PassengerCarriage carriage1 = new PassengerCarriage(133456, 50);
        Passenger passenger1 = new Passenger(UUID.randomUUID(), "Eren", "Yeager", 15, 26);
        Passenger passenger2 = new Passenger(UUID.randomUUID(), "Levi", "Ackerman", 32, 15);

        carriage1.addPassenger(passenger1);
        carriage1.addPassenger(passenger2);

        List<Passenger> list1= new ArrayList<>();
        list1.add(passenger1);
        list1.add(passenger2);
        assertEquals(list1, carriage1.getListOfPassengers());

        Passenger passenger3 = new Passenger(UUID.randomUUID(), "Erwin", "Smith", 38, 15);

        Throwable exception = assertThrows(Exception.class, () -> carriage1.addPassenger(passenger3));
        assertEquals("This seat is already taken", exception.getMessage());
    }

    @Test
    void TestToString(){
        PassengerCarriage carriage1 = new PassengerCarriage(1_000_001, 55);
        assertEquals("CarriageID: 1000001", carriage1.toString());
    }
}