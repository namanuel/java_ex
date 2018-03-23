package at.namanuel;

import javax.swing.*;

/**
 * Guaranteed calculation of sum, difference, product and quotient.
 *
 * <P>This program calculates sum, difference, product and quotient.
 * The successful calculation is guaranteed as input in repeated until
 * valid real numbers are entered.
 *
 * <P>Usage:
 *
 *   <P><b>java</b> Retry
 *
 * @author 	Manuel Nagel
 * @version 1.0
 *
 */
public class Retry {
    /**
     *  Hauptprogramm.
     *
     * @param args Kommandozeilenparameter
     */
    public static void main(String[] args) {

        // TODO (1)
        // Create two `Double` object and initialize them
        // with reasonable values.
        //
        Double number1 = 5.0;
        Double number2 = 12.0;
        Double input_user1 = 0.0;
        Double input_user2 = 0.0;
        JFrame frame_input = new JFrame("Input");
        JFrame frame_message = new JFrame("Message");
        String input1 ="";
        String input2 = "";

        // TODO (2)
        // Repeat until user entry is a valid real number.
        //


        try{
            while(Math.abs(number1) != input_user1 || Math.abs(number2) != input_user2){

                if(Math.abs(number1) != input_user1) {
                    input1 = JOptionPane.showInputDialog(frame_input, "Please enter a valid (real) number: ");
                }
                if(Math.abs(number2) != input_user2) {
                    input2 = JOptionPane.showInputDialog(frame_input, "Please enter a second valid (real) number: ");
                }


                if(!(input1.equals(null)|input2.equals(null)|input1.equals("")|input2.equals(""))){
                    input_user1 = Double.parseDouble(input1);
                    input_user2 = Double.parseDouble(input2);
                }
                else{
                    javax.swing.JOptionPane.showMessageDialog(frame_message, "!!Invalid Input!!");
                }
                if (Math.abs(number1) != input_user1 || Math.abs(number2) != input_user2){
                    javax.swing.JOptionPane.showMessageDialog(frame_message, "Wrong entry, please try again!");
                }
            }
            printInfo(number1, number2);
            System.exit(0);

        } catch(NumberFormatException|NullPointerException e){
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(frame_message, "!!Invalid Input!!");
        }


    }
    static public void printInfo(Double number1, Double number2){
        Double quotient = 0.0;
        String output_message = "";
        if(Math.abs(number1) == 0 || Math.abs(number2)== 0){
            output_message ="Division kann nicht durchgeführt werden!";
        }else{
            quotient = number1/number2;

        }

        String message = "Number 1: " + number1+"\n"
                + "Number 2: " + number2+"\n"
                + "Sum: " + (number1 + number2) +"\n"
                + "Difference: " + (number1 - number2) + "\n"
                +"Product: " + (number1*number2) + "\n"
                +"Quotient: " + quotient + output_message +"\n";
        System.out.println(message);
        javax.swing.JOptionPane.showMessageDialog(new JFrame(), message);
    }
}
