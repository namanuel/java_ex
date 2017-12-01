package at.namanuel;

public class Circle {



    public static void main(String[] args){
        Helper help1 = new Helper();
        Helper help2 = new Helper(5.2, "Yellow");
        double calarea;
        help1.setmRadius(7.6);
        help2.setmColor("Blue");
        calarea = help1.calculateAreaDifference(help2);
        Helper help3 = help1;

        System.out.println("Color: Circle 1 = Circle 3 : " + help3.hasColorAs(help1));
        System.out.println("Color: Circle 2 = Circle 3 : " + help3.hasColorAs(help2));
        help2.printInformation();

        System.out.println("Area difference Circle 1 and Circle 2: " + Math.round(calarea));
    }
}
