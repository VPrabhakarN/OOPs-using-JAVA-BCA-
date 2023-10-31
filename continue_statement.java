// Java program by using continue statement

public class continue_statement {
    public static void main(String args[])
    {

        int i;

        //using for loop
        for(i=1; i<=10; i++)
        {
            //using continue statement
            if(i==5)
            {
                continue;
            }
            System.out.println(i);
        }
    }
    
}
