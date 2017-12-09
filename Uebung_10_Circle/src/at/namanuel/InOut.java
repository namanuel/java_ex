package at.namanuel;


import java.io.*;
import java.util.*;

public class InOut {
    //Klasse fürs Einlesen         für die Übersichtlichkeit
    private List<Circle> list;

    public void read(String input) {
        int i = 0;
        double radius = 0;
        String color = "";
        list = new ArrayList<Circle>();
        String line;
        FileReader fr = null;
        try {
            fr = new FileReader(input);
        } catch (FileNotFoundException e1) {
            /*
            es wird "versucht" das File zu öffnen -> wenn nicht vorhanden Fehler
            Standard Exception werden verwendet
            */
            e1.printStackTrace();
        }
//            BufferedReader br = new BufferedReader(fr);
        try {
            Scanner br = new Scanner(fr);

            while (br.hasNext()) {
                line = br.nextLine();
//            if (br.hasNextDouble()) {
//                System.out.println(br.nextDouble());
//            }
//            else{
//                System.out.println(br.next());
//            }
                for (String w : line.split(";")) {
                /*
                hier wird die eingelesene Zeile gesplitet
                es gibt sicher eine schönere Methode, aber ich hab sie einfach nicht zum laufen gebracht
                zeile wird in String "Farbe" und Double "Radius" geteilt
                wenn es anderes herum eingegeben wird crasht es sowieso schon bei der Abfrage ob die Argumente die Richtigen sind
                */
                    try {
                        if (i == 0) {
                            color = w;
                            i++;
                        } else {
                            radius = Double.parseDouble(w);
                            i = 0;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("CSV-File hast das falsche Format: color;radius(Z.Z)");
                    }

                }
                list.add(new Circle(radius, color));

            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Fehler beim lesen der Datei");
             /*
             es kann immer zu Fehler kommen wenn etwas aus einer Datei ausgelesen werden soll
             deshalb sicherheitshalber wieder eine Exception
             */
        }

    }
        //Um die eingegebene Liste "woanders" zu verwenden

    public List<Circle> getList() {
        return list;
    }
}
