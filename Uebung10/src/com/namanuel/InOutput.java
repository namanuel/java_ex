package com.namanuel;
import java.io.*;
import java.util.*;

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
            BMI.printHelp();
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
                BMI.printHelp();
            }
        }
    }
    public void ausgabe(){
        for (String person:datalist) {
            System.out.println(person);
        }

    }
}
