// Java program to take input from the user

import java.util.Scanner;

public class taking_input_from_user {
    public static void main(String args[])
    {
        int a,b;

        //create an instance for scanner class
        Scanner sc = new Scanner(System.in);

        //taking input from user 
        System.out.println("Enter the first number : ");
        a = sc.nextInt();

        System.out.println("Enter second number : ");
        b = sc.nextInt();

        //now print the value after performing addition 
        System.out.println("Addition : "+ (a+b));
    }
    
}
