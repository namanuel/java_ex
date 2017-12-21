package vehicles;

import motorsports.Competitive;

public class Bicycle extends Vehicle implements Competitive{
    private String driverName;
    private int passenger;
    private int seat;

    public Bicycle(){

    }
    public Bicycle(String driverName){
        this.driverName = driverName;
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

    @Override
    public void race() {
        System.out.println("Bike " + getDriverName() + " on Track");
    }
}
