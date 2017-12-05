package at.namanuel;

import java.util.Random;

public class Point2DMain {
    public static void printHelp(){
        System.out.println("Input: inputfilename + path and outputfilename"
                +"\nExample: res/vectors.csv new_file.csv reference -1 1");

    }

    public static void main(String[] args) {
        InOutput inout = new InOutput();
        String input, output;
        if(args.length == 5){
            inout.read(input = args[0]);
            inout.write(output = args[1]);
        }
        else{
            printHelp();
        }

        inout.ausgabe();
        /*
        Point2D pointA = new Point2D();
        pointA.setName("origin");

        Point2D pointB = new Point2D(0.0, 0.0);
        pointB.setPos(0.0, 1.0);
        pointB.setName("unit vector");

        Point2D pointC = new Point2D(-10.0, -10.0, "negative vector");
        assert pointC.getX() < 0 && pointC.getY() < 0 : "vector not negative!";

        Random random = new Random();
        Point2D pointD = new Point2D(random.nextDouble() * 100,
                random.nextDouble() * 100,
                "random vector");

        pointA.printInformation();
        pointB.printInformation();
        pointC.printInformation();
        pointD.printInformation();

        System.out.format("distance from %s to %s: %.2f%n",
                pointB.getName(), pointD.getName(),
                pointB.distanceTo(pointD));

                */
    }
}
