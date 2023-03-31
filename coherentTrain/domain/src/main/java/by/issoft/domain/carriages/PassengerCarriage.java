package by.issoft.domain.carriages;

import by.issoft.domain.Carriage;
import by.issoft.domain.users.Passenger;

import java.util.ArrayList;
import java.util.List;

public class PassengerCarriage extends Carriage {
    private final int numberOfSeats;
    private final List<Passenger> listOfPassengers;
    private final boolean takenSeats[];

    public PassengerCarriage(int carriageID, int numberOfSeats) {
        super(carriageID);
        this.numberOfSeats = numberOfSeats;
        this.listOfPassengers = new ArrayList<>();
        this.takenSeats = new boolean[numberOfSeats];
    }

    public void addPassenger(Passenger passenger) throws Exception {
        if(!takenSeats[passenger.getTicket()]) {
            listOfPassengers.add(passenger);
            takenSeats[passenger.getTicket()] = true;
        } else {
            throw new Exception("This seat is already taken");
        }
    }

    public List getListOfPassengers(){
        return listOfPassengers;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
