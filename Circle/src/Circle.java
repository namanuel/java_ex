public class Circle {

    public static double calculatedArea(double radius){
        double summe;
        summe = radius*radius* Math.PI;
        return summe;
    }
    public static double calculateAreaDifference(double radius1, double radius2){
        double summe1 = radius1*radius1* Math.PI;
        double summe2 = radius2*radius2* Math.PI;
        double difference=0;
        if (summe1 > summe2){
            difference=summe1-summe2;
            return difference;
        }
        else{
            difference=summe2-summe1;
            return difference;
        }
    }
    public static boolean hasColorAs(String color1, String color2){
        boolean gleich;
        if (color1 == color2){
            return gleich = true;
        }
        else{
            return gleich = false;
        }
    }
    public static void printInformation(){
        Helper helper = new Helper ("RED","YELLOW", 2.5, 5);
        System.out.println("Circle 1 : " + calculatedArea(helper.getmRadius1()) + " Circle 2 : " + calculatedArea(helper.getmRadius2()));
        System.out.println("Difference : " + calculateAreaDifference(helper.getmRadius1(),helper.getmRadius2()));
        System.out.println("Same Color : " + hasColorAs(helper.getmColor1(),helper.getmColor2()));

    }
    public static void main(String[] args){

        printInformation();


    }
}
