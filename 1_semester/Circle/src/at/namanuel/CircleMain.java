package at.namanuel;

public class CircleMain {


    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.2, "Yellow");
        double calarea;
        c1.setmRadius(7.6);
        c1.setmColor("Blue");
        calarea = c1.calculateAreaDifference(c2);
        Circle c3 = c1;

        System.out.println("Color: Circle 1 = Circle 3 : " + c3.hasColorAs(c1));
        System.out.println("Color: Circle 2 = Circle 3 : " + c3.hasColorAs(c2));
        c2.printInformation();

        System.out.println("Area difference Circle 1 and Circle 2: " + Math.round(calarea));
    }
}
