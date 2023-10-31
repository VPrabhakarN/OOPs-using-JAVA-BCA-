// Java program to define array by taking values from the user 

import java.util.Scanner;

public class array_by_taking_value_from_user {
    public static void main(String args[])
    {
        int size, i;

        //create an instance for scanner class
        Scanner sc = new Scanner(System.in);

        //taking the size of array from user
        System.out.println("Enter the size of the array : ");
        size = sc.nextInt();

        //define array
        int a[] = new int[size];
        
        //using for loop for inserting values
        for(i=0; i<=size; i++)
        {
            System.out.println("Enter the element of the array : ");
            i = sc.nextInt();
        }
        System.out.println("Array Elements : ");
        for(i=0; i<=size; i++)
        {
            System.out.println(a[i]);
        }


    }
    
}
