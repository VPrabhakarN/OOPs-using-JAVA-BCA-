// Java program to define multi dimensional array 

import java.util.Scanner;

public class multi_dimensional_array_value_from_user {
    public static void main(String args[])
    {
        // Create instance for scanner class 
        Scanner sc = new Scanner(System.in);
        
        //taking the size of array from user 
        System.out.println("Enter the row size of the array : ");
        int row = sc.nextInt();
        System.out.println("Enter the size of the colomn : ");
        int col = sc.nextInt();

        //using for loop
        for(int i=0; i<=row; i++)
        {
            for(int j=0; j<=col; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<=row; i++)
        {
            for(int j=0; j<=col; j++)
            {
                System.out.println(a[i][j]);
            }
        }
    }  
}
