package at.namanuel;

import java.text.DecimalFormat;

public class Circle {

    private String mColor;
    private double mRadius;
    public Circle(){ //default constructor

    }
    public Circle(double mRadius, String mColor){
        setmRadius(mRadius);
        setmColor(mColor);
    }

    public double calculatedArea(){
        return Math.PI * getmRadius() * getmRadius();
    }

    public double calculateAreaDifference(Circle circle){
        return (Math.PI * this.getmRadius() * this.getmRadius()) - (Math.PI * circle.getmRadius() * circle.getmRadius());
    }

    public boolean hasColorAs(Circle circle){
        //if(circle.getmColor() == this.getmColor()){
        if(this.getmColor().equals(circle.getmColor())){
            return true;
        }else{
            return false;
        }
    }

    public void printInformation(){
        System.out.println("Color: " + getmColor() + " Radius: " + getmRadius() + " Area: "+ Math.round(calculatedArea()));

    }

    public double getmRadius(){
        return mRadius;
    }
    public void setmRadius(double mRadius){
        this.mRadius = mRadius;
    }
    public String getmColor(){
        return mColor;
    }
    public void setmColor(String mColor){
        this.mColor = mColor;
    }
}
