package by.issoft.domain.carriages;

import by.issoft.domain.users.Driver;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class LocomotiveTest {

    @Test
    void testToString() {
        Locomotive locomotive = new Locomotive(1_000_005, new Driver(UUID.randomUUID(), "Ragnar", "Lothbrok", 30, true));
        assertEquals("CarriageID: 1000005", locomotive.toString());
    }
}