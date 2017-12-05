package at.namanuel;

import java.io.*;
import java.util.*;

public class CircleDemo {

    public static void printHelp(){
        System.out.println("Input: inputfilename + path and outputfilename"
                +"\nExample: res/circles.csv new_file.csv red 3.4");

    }

    public static void main(String[] args){
        InOut io = new InOut();
        String input, output;
        String color = "";
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



        //Circle c1 = new Circle();
        Circle c2 = new Circle(r, color);
        //double calarea;
        //c1.setmRadius(7.6);
        //c1.setmColor("Blue");
        //calarea = c1.calculateAreaDifference(c2);
        //Circle c3 = c1;

        //System.out.println("Color: Circle 1 = Circle 3 : " + c3.hasColorAs(c1));
        //System.out.println("Color: Circle 2 = Circle 3 : " + c3.hasColorAs(c2));
        c2.printInformation();

        //System.out.println("Area difference Circle 1 and Circle 2: " + Math.round(calarea));
    }


}
