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
        List<Circle> circlelist = new ArrayList<>();
        List<String> outputlist = new ArrayList<String>();
        String input = "", output = "",color = "";
        DecimalFormat df = new DecimalFormat(".###");
        //df.format(myNumber)
        double r = 0;
        if(args.length == 4){
            io.read(input = args[0]);
            output = args[1];
            color = args[2];
            r = Double.parseDouble(args[3]);
        }
        else{
            printHelp();
        }
        circlelist = io.getList();
        Circle cinput = new Circle(r, color);//input circle
        for (Circle c: circlelist){
            c.getmColor();
            c.getmRadius();
            if(cinput.hasColorAs(c)){
                outputlist.add(c.getmColor() +"; " + Double.toString(c.getmRadius())+"; " +df.format(c.calculateAreaDifference(cinput)));
            }


        }
        /*for (String s:outputlist){
            System.out.println(s);
        }*/
        Path file = Paths.get(output);
        try {
            Files.write(file, outputlist, Charset.forName("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }


        //calarea = c1.calculateAreaDifference(c2);
        //Circle c3 = c1;

        //System.out.println("Color: Circle 1 = Circle 3 : " + c3.hasColorAs(c1));
        //System.out.println("Color: Circle 2 = Circle 3 : " + c3.hasColorAs(c2));


        //System.out.println("Area difference Circle 1 and Circle 2: " + Math.round(calarea));
    }


}
