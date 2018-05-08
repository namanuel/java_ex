package at.namanuel;

import java.util.*;
import static at.namanuel.Weatherdata.getJSONdatafromURL;

public class Main {
    public static void main(String[] args){


        try {
            Scanner scanner;
            int day = 0;
            String input;
            while (true) {
                System.out.println("|1| - Wetter heute\n" +
                        "|2| - Wetter morgen\n" +
                        "|3| - Wetter 5 Tage\n" +
                        "|4| - Beenden\n" +
                        "------------------------------------");

                scanner = new Scanner(System.in);

                if (scanner.hasNextInt()) {
                    day = scanner.nextInt();
                    if (day == 4) {
                        System.exit(0);
                    }
                } else {
                    System.out.println("Leider keine Zahl gefunden.");
                }
                System.out.println("Welche Stadt:");

                scanner = new Scanner(System.in);
                input = scanner.nextLine();

                getJSONdatafromURL(input, day);
                scanner.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }


    }


}
