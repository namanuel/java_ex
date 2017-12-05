package at.namanuel;

import java.io.*;
import java.util.*;

public class InOut {
    //Klasse fürs Ein- und Auslesen         für die Übersichtlichkeit
    private List<Circle> list;
    public void read(String input){
        int i = 0;
        double radius =0;
        String color = "";
        list = new ArrayList<Circle>();
        Circle circles = new Circle();
        String zeile;
        try {
            FileReader fr = new FileReader(input);
            BufferedReader br = new BufferedReader(fr);
                    /*
                    es wird "versucht" das File zu öffnen -> wenn nicht vorhanden Fehler
                    Standard Exception werden verwendet
                     */

                try {
                    while ((zeile = br.readLine()) != null) {
                        for (String w : zeile.split(";")) {
                            /*
                            hier wird die eingelesene Zeile gesplitet
                            es gibt sicher eine schönere Methode
                            hab aber leider keine gefunden

                            zeile wird in String "Farbe" und Double "Radius" geteilt

                            wenn es anderes herum eingegeben wird crasht es sowieso schon bei der Abfrage ob die Argumente die Richtigen sidn
                             */

                            if (i == 0) {
                                color = w;
                                i++;
                            } else {
                                radius = Double.parseDouble(w);
                                i = 0;
                            }
                        }
                        list.add(new Circle(radius, color));
                    }
                    /*
                    es kann immer zu Fehler kommen wenn etwas aus einer Datei ausgelesen werden soll

                    deshalb sicherheitshalber wieder eine Exception
                     */
                } catch (IOException e) {
                    e.printStackTrace();
                }


        } catch(FileNotFoundException e) {
            e.printStackTrace();
            CircleDemo.printHelp();
        }

    }


    public List<Circle> getList(){
        return list;
    }
}
