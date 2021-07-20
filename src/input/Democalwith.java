package input;

import java.util.Scanner;

public class Democalwith {

    public int add(int a, int b){
        int sum=a+b;
        return sum;
    }
    public int sub(int a,int b){
        int sub=a-b;
        return sub;
    }
    public int multi(int a, int b){
        int result=a*b;
        return result;
    }
     public int div(int a,int b){
        int result=a/b;
        return result;
     }


    public static void main (String[] args) {

        int choice=0;
        int a=0;
        int b=0;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Welcome to Calculator App , please enter 1 for Addition,2 for Subtraction,3 for multi, and 4 for divide");
        choice=myObj.nextInt();
        System.out.println("Please enter the value a and b");
        a=myObj.nextInt();
        b=myObj.nextInt();

        //create object
        Democalwith object=new Democalwith();

     if (choice==1){
         // add method
         int sum=object.add(a,b);
         System.out.println("Addition output is.."+sum);
     }
    else if (choice==2){
        // subtraction method
          int result=object.sub(a,b);
          System.out.println("Subtraction output is.."+result);
     }
    else if (choice==3) {
         // multiple
      int result=object.multi(a,b);
      System.out.println("Multiple output is.."+result);
    }

    else {
         // divided
         int result=object.div(a,b);
         System.out.println("divided output is.."+result);

     }
    }
}
