import java.util.Scanner;

class Fibonnaci{
    public static void main(String args[]){

    Scanner userInput= new Scanner(System.in);
    System.out.println("Enter a number below between 1-10:");


int num1=0,num2=1,num4,count=10, i;
int num3=userInput.nextInt();


System.out.print(num1+" "+num2);
        
for (i=2;i<count;++i)
{
    num4=num1+num2+num3;
    System.out.print(" "+num3);
    num1=num2;
    num2=num3;
    num3=num4;
}


    }
}