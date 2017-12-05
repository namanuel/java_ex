package at.namanuel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InOutput {
    List<String> datalist = new ArrayList<String>();
    public void read(String input){

        Scanner scanner1 = null;
        try {
            scanner1 = new Scanner(new FileReader(new File(input)));
            while(scanner1.hasNextLine()) {
                datalist.add(scanner1.nextLine());
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
            //BMI.printHelp();
        }
    }


    public void write(String output){
        File f = new File(output);
        if(!f.exists()){
            try {
                PrintWriter creator = new PrintWriter(output);
                creator.close();
            }
            catch (Exception e) {
               // BMI.printHelp();
            }
        }
    }
    public void ausgabe(){
        for (String person:datalist) {
            System.out.println(person);
        }

    }
}
