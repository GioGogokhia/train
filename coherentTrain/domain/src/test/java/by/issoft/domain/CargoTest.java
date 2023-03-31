package by.issoft.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CargoTest {

    @Test
    void getWeight() {
        Cargo cargo1 = new Cargo(500_001, 30);
        assertEquals(30, cargo1.getWeight());
    }
}