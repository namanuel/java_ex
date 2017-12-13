package vehicles;

import motorsports.Competitive;

public class Car extends Vehicle implements Competitive{
    private String copilotName;
    private String driverName;
    private int passenger;
    private int seats;
    public Car(String driverName, String copilotName, int seats){

    }


    public String getCopilotName() {
        return copilotName;
    }

    public void setCopilotName(String copilotName) {
        this.copilotName = copilotName;
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
        return seats;
    }

    public void setSeatCapacity(int seats) {
        this.seats = seats;
    }
    public boolean hasEngine(){
        return false;
    }

    @Override
    public void race() {

    }
}
