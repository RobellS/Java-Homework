import java.util.Scanner;

class Armstrong{
    public static void main(String args[]){

    Scanner userInput= new Scanner(System.in);
    System.out.println("Enter number below to find out if it is an Armstrong Number:");
    int userNumber=userInput.nextInt();
  

        int originalNumber=userNumber, remainder, result = 0;


        while (userNumber != 0)
        {
            remainder=userNumber%10;
            userNumber=userNumber/10;
            result=result+(remainder*remainder*remainder);
        }

        if(result == originalNumber)
            System.out.println(originalNumber + " is an Armstrong number.");
        else
            System.out.println(originalNumber + " is not an Armstrong number.");
    }
}

        
