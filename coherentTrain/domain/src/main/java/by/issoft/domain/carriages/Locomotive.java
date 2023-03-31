package by.issoft.domain.carriages;

import by.issoft.domain.Carriage;
import by.issoft.domain.users.Driver;

public class Locomotive extends Carriage {
    Driver driver;

    public Locomotive(int carriageID,Driver driver) {
        super(carriageID);
        this.driver = driver;
    }

    @Override
    public int getCarriageID() {
        return super.getCarriageID();
    }

    @Override
    public String toString() {
        return "CarriageID: " + this.getCarriageID();
    }
}
