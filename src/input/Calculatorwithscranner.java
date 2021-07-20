package input;

import java.util.Scanner;

public class Calculatorwithscranner {

    // addition
    public int add (int a, int b) {
        int result = a + b;

        return result;
    }

    //Subtraction
    public int sub (int a, int b) {
        int result = a - b;

        return result;
    }
    public int multi(int a,int b){
        int result=a*b;
        return result;
    }
    public int div(int a,int b){
        int result=a/b;
        return result;
    }

    public static void main (String[] args) {
        int choice =0;
        int a = 0;
        int b = 0;

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Welcome to calculator app , please enter 1 addition,2 for subtraction,3 for multiple, 4 for divided ");
        choice = myObj.nextInt();
        System.out.println("Please enter the value a and b ");
        a = myObj.nextInt();
        b = myObj.nextInt();

        // create object
        Calculatorwithscranner object = new Calculatorwithscranner();

        if (choice == 1) {

            // call method
            int result = object.add(a, b);
            System.out.println("ADDITION OUTPUT IS: " + result);
        } else if (choice == 2) {
            int result = object.sub(a, b);
            System.out.println("SUBTRACTION OUTPUT IS: " + result);
        } else if (choice == 3) {
            // call multi
           int result=object.multi(a,b);
           System.out.println("Miltiple output is.."+result);
        }

         else {
            // call divided
            int result=object.div(a,b);
            System.out.println("Divided output is.."+result);

        }
    }
}
