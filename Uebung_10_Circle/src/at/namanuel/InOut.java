package at.namanuel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InOut {
    public void read(String input){
        List<Circle> circledata = new ArrayList<>();
        Scanner scanner1 = null;
        try {
            scanner1 = new Scanner(new FileReader(new File(input)));
            while(scanner1.hasNextLine()) {
               // Pointer.add(scanner1.nextLine());
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
            CircleDemo.printHelp();
        }
    }
}
