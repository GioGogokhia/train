package by.issoft.domain.carriages;

import by.issoft.domain.Cargo;
import by.issoft.domain.Carriage;

import java.util.ArrayList;
import java.util.List;

public class FreightCarriage extends Carriage {
    private final int carryingCapacity;
    private final List<Cargo> listOfCargo;

    public FreightCarriage(int carriageID, int carryingCapacity) {
        super(carriageID);
        this.carryingCapacity = carryingCapacity;
        listOfCargo = new ArrayList<>();
    }

    //helper method, so we do not overload "addCargo" method
    public int getTotalWeight(){
        int totalWeight = 0;
        for(Cargo cargo : listOfCargo){
            totalWeight += cargo.getWeight();
        }
        return totalWeight;
    }

    public void addCargo(Cargo cargo) throws Exception {
        if(this.getTotalWeight() + cargo.getWeight() <= carryingCapacity){
            listOfCargo.add(cargo);
        }
        else {
            throw new Exception("Cargo can't fit in this carriage, please try locating it to another one");
        }
    }

    public List getListOfCargo(){
        return this.listOfCargo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
