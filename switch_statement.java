// Java program by using switch statement 

/* SYNTAX : 
            switch(expression)
            {
                case value 1 : // statement 1;
                               break;
                
                case value 2 : // statement 2;
                               break;

                case value 3 : // statement 3;
                               break;

                default : // statement;
            }
*/

public class switch_statement {
    public static void main(String args[])
    {
        int choice = 2;
        
        //using switch loop 
        switch(choice)
        {
            case 1 : System.out.println("Hello World");
                     break;
            case 2 : System.out.println("How are you?");
                     break;
            case 3 : System.out.println("Get well soon");
                     break;
            default : System.out.println("Good Bye!");
        }
    }    
}
