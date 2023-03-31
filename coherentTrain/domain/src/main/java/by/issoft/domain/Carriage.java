package by.issoft.domain;

public abstract class Carriage {
    private final int carriageID;

    public Carriage(int carriageID) {
        this.carriageID = carriageID;
    }

    public int getCarriageID(){
        return carriageID;
    }

    @Override
    public String toString(){
        return "CarriageID: " + this.getCarriageID();
    }
}
