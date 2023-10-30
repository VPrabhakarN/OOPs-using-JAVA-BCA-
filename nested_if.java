// Java program by using nested if statement

/* SYNTAX : 
             if(condition 1)
             {
                if(condition 2)
                {
                    // code here
                }
                else 
                {
                    // code here
                }
             }
             else 
             {
                // code here
             }
*/ 

public class nested_if {
    public static void main (String args[])
    {
        int a = 2, b = 2, c = 3;
         
        //using nested if 
        if(a == b)
        {
            if(a == c)
            {
                System.out.println("Equal");
            }
            else 
            {
                System.out.println("Not Equal");
            }
        }
        else 
        {
            System.out.println("May be All values are not equal");
        }
    } 
}
