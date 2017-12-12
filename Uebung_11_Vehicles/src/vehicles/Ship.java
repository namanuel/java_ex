package vehicles;

public class Ship extends Vehicle {
    private String captainName;
    private boolean engine;
    private int passenger;
    private int seats;


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
        return true;
    }

    public Ship(String captainName, int passenger, int seats, boolean engine){

    }

    public String toString(){
        return "";
    }
}
