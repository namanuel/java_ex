package app;

import motorsports.Competitive;
import vehicles.*;

import java.util.ArrayList;

public class RacingCircuit {
    public static void main(String[] args){
        // Create ArrayList of `Vehicle`s.

        ArrayList<Vehicle> starterList = new ArrayList<>();
        Competitive competitor;

        // TODO: Add different vehicles to the list (of starters)
        Bicycle bike = new Bicycle("Axel Stein");
        Car c1 = new Car("Herbie","Jim Douglas",2);
        Car c2 = new Car("Jean-Pierre","Matthias Malmedie",2);
        Car c3 = new Car("K.I.T.T","Michael Knight",2);
        Ship s1 = new Ship("Pirate Ship","Blackbeard",50,70,false);
        Ship s2 = new Ship("Pirate Ship", "Monkey D. Luffy",10,10,false);

        starterList.add(c1);
        starterList.add(c2);
        starterList.add(c3);
        starterList.add(bike);
        starterList.add(s1);
        starterList.add(s2);

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
