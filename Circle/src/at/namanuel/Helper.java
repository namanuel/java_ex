package at.namanuel;

public class Helper {
    private String mColor;
    private double mRadius;
    public Helper(){ //default constructor

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
    public Helper(double mRadius, String mColor){
        setmRadius(mRadius);
        setmColor(mColor);
    }
    public double calculatedArea(){
        return Math.PI * getmRadius() * getmRadius();
    }
    public double calculateAreaDifference(Helper helper){
        return (Math.PI * this.getmRadius() * this.getmRadius()) - (Math.PI * helper.getmRadius() * helper.getmRadius());
    }
    public boolean hasColorAs(Helper helper){
        if(helper.getmColor() == this.getmColor()){
            return true;
        }else{
            return false;
        }
    }
    public void printInformation(){
        System.out.println("Cricle radius: " + getmRadius() + "\nArea: "+ Math.round(calculatedArea()) + "\nColor: " + getmColor());

    }


}
