// Java program to define array 

public class array_in_java {
    public static void main(String args[])
    {
        int a[] = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        System.out.println("Elements in array  : ");

        //using for loop to traverse array
        for( int i=0; i<=3; i++)
        {
            System.out.println(a[i]);
        }
    }
    
}
