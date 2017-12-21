package vehicles;

public class Ship extends Vehicle {
    private String captainName;
    private String shipType;
    private boolean engine;
    private int passenger;
    private int seats;

    public Ship(String shipType, String captainName, int passenger, int seats, boolean engine){
        this.captainName = captainName;
        this.passenger = passenger;
        this.seats = seats;
        this.engine = engine;
        this.shipType = shipType;

    }


    @Override
    public int getPassenger() {
        return passenger;
    }
    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    @Override
    public int getSeatCapacity () {
        return seats;
    }
    public void setSeatCapacity(int seats) {
        this.seats = seats;
    }
    public boolean hasEngine(){
        return true;
    }

    @Override
    public String toString(){
        return shipType + "[p:" + passenger + "|s:" + seats +"|cap:" + captainName + "]";
    }
}
