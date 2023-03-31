package by.issoft.domain.carriages;

import by.issoft.domain.Cargo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FreightCarriageTest {

    @Test
    void getTotalWeight() throws Exception {
        FreightCarriage carriage1 = new FreightCarriage(201000, 1000);
        Cargo cargo1 = new Cargo(400_000,300);
        Cargo cargo2 = new Cargo(400_001,450);

        carriage1.addCargo(cargo1);
        carriage1.addCargo(cargo2);
        assertEquals(750, carriage1.getTotalWeight());
    }

    @Test
    void addCargo() throws Exception {
        FreightCarriage carriage1 = new FreightCarriage(201_000, 1000);
        Cargo cargo1 = new Cargo(400_003,300);
        Cargo cargo2 = new Cargo(400_004,450);

        carriage1.addCargo(cargo1);
        carriage1.addCargo(cargo2);

        List<Cargo> list1= new ArrayList<>();
        list1.add(cargo1);
        list1.add(cargo2);
        assertEquals(list1, carriage1.getListOfCargo());

        Cargo cargo3 = new Cargo(400_005,570);

        Throwable exception = assertThrows(Exception.class, () -> carriage1.addCargo(cargo3));
        assertEquals("Cargo can't fit in this carriage, please try locating it to another one", exception.getMessage());
    }

    @Test
    void TestToString(){
        FreightCarriage carriage1 = new FreightCarriage(204_000, 1200);
        assertEquals("CarriageID: 204000", carriage1.toString());
    }
}