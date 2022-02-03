//Write an if/else statement for the following requirements:
// If student gets 90 or higher: console log  A
// If students get 80 or above: console log B
// If students get 70 or above: console log C
// If students get 55 or above: console log D
// Any grade lower than 55 is F

public class Week1hw1{
    public static void main(String args[]){

        int grade;

        grade= 56;

    if(grade >= 90)
    {
        System.out.println("You got an A!");
    }
    else if (grade>=80 & grade < 90 )
    {
        System.out.println("You got a B!");
    }
     else if (grade>=70 & grade <80 )
    {
        System.out.println("You got a C.");
    }
     else if (grade>=55 & grade <70 )
    {
        System.out.println("You got a D.");
    }
     else if (grade<55)
    {
        System.out.println("You failed.");
    }
    else{
        System.out.println("Invalid grade. Try again.");
    }    
    }
}