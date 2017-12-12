package vehicles;

public class Bicycle extends Vehicle {
    private String driverName;
    private int passenger;
    private int seat;

    public Bicycle(){

    }
    public Bicycle(String driverName){

    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getSeatCapacity () {
        return seat;
    }

    public void setSeatCapacity(int seat) {
        this.seat = seat;
    }
    public boolean hasEngine(){
        return false;
    }
}
