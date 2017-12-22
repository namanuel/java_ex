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
        String fields[];
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

                fields = line.split(";");
                list.add(new Circle(Double.parseDouble(fields[1]), fields[0]));
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
