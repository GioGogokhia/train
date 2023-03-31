package by.issoft.domain;

public class Cargo {
    private final int cargoID;
    private final int weight;


    public Cargo(int cargoID, int weight) {
        this.cargoID = cargoID;
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }
}
