package by.issoft.domain.users;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {
    @Test
    void Driver() throws IllegalArgumentException{
        Driver driver1 = new Driver(UUID.randomUUID(), "Zeke", "Yaeger", 25, true);

        Throwable exception = assertThrows(Exception.class, () -> new Driver(UUID.randomUUID(), "Mikasa", "Ackerman", 15, true));
        assertEquals("Driver can not be underage!", exception.getMessage());

        Throwable exception1 = assertThrows(Exception.class, () -> new Driver(UUID.randomUUID(), "Jon", "Snow", 25, false));
        assertEquals("Driver can not be underage!", exception.getMessage());
    }
}