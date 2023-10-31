// Java program by using return statement

public class return_statement {
    public static void main(String args[])
    {
        int i;

        //using for loop
        for(i=1; i<=10; i++)
        {
            //usinf return statement
            if(i==5)
            {
                return;
            }
            else 
            {
                System.out.println(i);
            }
        }
    }
    
}
