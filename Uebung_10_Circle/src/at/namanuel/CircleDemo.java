package at.namanuel;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.text.DecimalFormat;
import java.util.*;

public class CircleDemo {

    public static void printHelp(){
        System.out.println("Input: inputfilename + path and outputfilename"
                +"\nExample: res/circles.csv new_file.csv red 3.4");

    }

    public static void main(String[] args){
        InOut io = new InOut();
        List<Circle> listOfCircles = new ArrayList<>();
        List<String> listOfOutputs = new ArrayList<>();
        String output = "",color = "";
        DecimalFormat df = new DecimalFormat(".###");//Format aus der Angabe angeben ^^
        double r = 0;

        if(args.length == 4){

            //Consolen eingabe wird "verteilt"
            io.read(args[0]);
            output = args[1];
            color = args[2];
            r = Double.parseDouble(args[3]);
        }
        else{
            printHelp();
        }
        listOfCircles = io.getList();
        Circle cinput = new Circle(r, color);//input circle
        for (Circle c: listOfCircles){
            c.getmColor();
            c.getmRadius();
            if(cinput.hasColorAs(c)){
                listOfOutputs.add(c.getmColor() +"; " + Double.toString(c.getmRadius())+"; " +df.format(c.calculateAreaDifference(cinput)));
            }


        }
        /*for (String s:outputlist){
            System.out.println(s);
        }*/
        Path file = Paths.get(output);
        try {
            Files.write(file, listOfOutputs, Charset.forName("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
