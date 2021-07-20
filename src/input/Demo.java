package input;

import java.util.Scanner;

public class Demo {

    public static void main (String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Please Enter username");
        String username= myObj.nextLine();
        System.out.println("You are entered username as: "+username);

        System.out.println("you are enter your age");
        int umar= myObj.nextInt();
        System.out.println("You have entered age as: "+umar);


        System.out.println("Please enter your salary");
        double salary=myObj.nextDouble();
        System.out.println("You have entered salary us: "+salary);

    }
}
