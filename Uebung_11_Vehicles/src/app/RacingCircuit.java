package app;

import motorsports.Competitive;
import vehicles.*;

import java.util.ArrayList;

public class RacingCircuit {
    public void main(String[] args){
        // Create ArrayList of `Vehicle`s.

        ArrayList<Vehicle> starterList = new ArrayList<>();
        Competitive competitor;

        // TODO: Add different vehicles to the list (of starters)

        // First all bicycles start.
        for (Vehicle bicycle : starterList) {
            if ((bicycle instanceof Competitive) && (bicycle instanceof Bicycle)) {
                competitor = (Competitive) bicycle;
                competitor.race();
            }
        }

        // Followed by the cars.
        for (Vehicle car : starterList) {
            if ((car instanceof Competitive) && (car instanceof Car)) {
                competitor = (Competitive) car;
                competitor.race();
            }
        }

        // Finally, all ships are sorted out.
        for (Vehicle boat : starterList) {
            if (boat instanceof Ship) {
                System.out.println("Boats can't compete at this racing circuit!");
                System.out.println(boat);
            }
        }
    }
}
