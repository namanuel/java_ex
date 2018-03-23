package at.namanuel;

import java.awt.geom.Point2D;
import java.io.*;
import java.util.*;


public class NamedPoint extends Point2D.Double {
    private String mName;
    private double mX, mY;
    List<String> Pointer = new ArrayList<String>();
    public void read(String input){

        Scanner scanner1 = null;
        try {
            scanner1 = new Scanner(new FileReader(new File(input)));
            while(scanner1.hasNextLine()) {
                Pointer.add(scanner1.nextLine());
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
            Point2DMain.printHelp();
        }
    }
    /*

    */
    /*
    public void ausgabe(){
        for (String person:Pointer) {
            System.out.println(person);
        }
    }
    */
    public NamedPoint(){

    }
    public NamedPoint(double x, double y, String name){
        this.mX = x;
        this.mY = y;
        this.mName = name;
    }

    public double calculateLength(){
        return Math.hypot(mX, mY);
    }

    public void printInformation() {
        System.out.println(mName);
        System.out.format("coords: %10.2f, %10.2f%n", mX, mY);
        System.out.format("length: %10.2f%n%n", this.calculateLength());
    }
    public double distanceTo(NamedPoint point) {
        return Math.hypot(mX - point.getX(), mY - point.getY());
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public double getX() {
        return mX;
    }

    public void setX(double x) {
        this.mX = x;
    }

    public double getY() {
        return mY;
    }

    public void setY(double y) {
        this.mY = y;
    }


    @Override
    public void setLocation(double x, double y) {

    }
}
