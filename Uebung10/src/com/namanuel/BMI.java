package com.namanuel;

public class BMI {
    public static void printHelp(){
        System.out.println("Input: inputfilename + path and outputfilename"
                +"\nExample: ../persons.csv ../new_file.csv");

    }
    public static void main(String[] args){
        Helper helper = new Helper();
        InOutput inout = new InOutput();
        String input, output;
       if(args.length == 2){
            inout.read(input = args[0]);
            inout.write(output = args[1]);
       }
       else{
           printHelp();
       }

       inout.ausgabe();
    }
}
