// Store a number in a variable called num and write an if statement: 
// If num is odd, display "Cool"
// If num is even and between 2-5, display "Not Cool"
// If num is even and between 6-20, display "Cool"
// If num is even and greater than 20, display "Not Cool
public class Week1hw3{
    public static void main(String args[]){

    int num=30;

    if (num % 2 == 0)
    {
        if(num >=2 & num<=5)
        {
            System.out.println("Not cool.");
        }
        else if(num>=6 & num<=20)
        {
            System.out.println("Cool");
        }
        else if(num>20)
        {
            System.out.println("Not cool.");
        }
    }
    else
    {
        System.out.println("Cool.");
    }
    
    }//Main paranthesis
}//class paranthesis