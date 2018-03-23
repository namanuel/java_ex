package vehicles;

public abstract class Vehicle {

    //Manuel: setSeatCapacity hinzugefügt

    public abstract int getPassenger();
    public abstract int getSeatCapacity();
    public abstract void setSeatCapacity(int seats);
    public abstract boolean hasEngine();
}
