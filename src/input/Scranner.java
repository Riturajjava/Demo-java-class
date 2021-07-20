package input;

import java.util.Scanner;

public class Scranner {

    public static void main (String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Please enter username");
         // String input
         String username= myObj.nextLine();// Read input
         System.out.println("You have entered User as: "+username);// Output user input

        // Numerical input
        System.out.println("Please enter your Age ");

        int age= myObj.nextInt();
        System.out.println("you have entered Age as: "+age);

        System.out.println("Please enter your salary");
        double Salary= myObj.nextDouble();
        System.out.println("You have entered salary as: "+Salary);







    }
}
