package by.issoft.domain;

import by.issoft.domain.carriages.FreightCarriage;
import by.issoft.domain.carriages.Locomotive;
import by.issoft.domain.carriages.PassengerCarriage;
import by.issoft.domain.users.Driver;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static by.issoft.domain.Train.printTrain;
import static org.junit.jupiter.api.Assertions.*;

class TrainTest {

    @Test
    void addCarriage() {
        Train train1 = new Train();
        Locomotive locomotive = new Locomotive(1_000_000, new Driver(UUID.randomUUID(), "Reiner", "braun", 21, true));
        FreightCarriage carriage1 = new FreightCarriage(1_000_001, 3000);
        PassengerCarriage carriage2 = new PassengerCarriage(1_000_002, 60);

        Throwable exception = assertThrows(Exception.class, () -> Train.addCarriage(train1, carriage1));
        assertEquals("First carriage should be a locomotive", exception.getMessage());

        Train.addCarriage(train1, locomotive);
        Train.addCarriage(train1, carriage1);
        Train.addCarriage(train1, carriage2);

        assertEquals("Train: " + locomotive.toString() + " " + carriage1.toString() + " " + carriage2.toString() + " ", printTrain(train1));
    }

    @Test
    void removeCarriageByID() {
        Train train1 = new Train();
        Locomotive locomotive = new Locomotive(1_000_004, new Driver(UUID.randomUUID(), "Annie", "Leonhart", 20, true));
        FreightCarriage carriage1 = new FreightCarriage(1_000_005, 2000);
        PassengerCarriage carriage2 = new PassengerCarriage(1_000_006, 50);

        Train.addCarriage(train1, locomotive);
        Train.addCarriage(train1, carriage1);
        Train.addCarriage(train1, carriage2);

        Throwable exception = assertThrows(Exception.class, () -> Train.removeCarriageByID(train1, 1_000_004));
        assertEquals("You can not remove the locomotive!", exception.getMessage());

        Train.removeCarriageByID(train1, 1_000_005);

        assertEquals("Train: " + locomotive.toString() + " " + carriage2.toString() + " ", printTrain(train1));

        FreightCarriage carriage3 = new FreightCarriage(1_000_007, 6000);

        Train.addCarriage(train1, carriage3);
        Train.removeCarriageByID(train1, 1_000_008);
        assertEquals("Train: " + locomotive.toString() + " " + carriage2.toString() + " " + carriage3.toString() + " ", printTrain(train1));
    }
}