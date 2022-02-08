package Calculator;
import java.util.Scanner;


public class Calc {
	
	static int plusMethod(int x, int y) {
		
		return x + y;
	}
	static int subMethod(int x, int y) {
		return x - y;
	}
	static int multMethod(int x, int y) {
		return x * y;
	}
	static int divMethod(int x, int y) {
		return x/y;
	}
	

	public static void main(String[] args) {
		
	System.out.println("Choose your operation below by typing number associated: 1) Add 2) Subtract 3) Multiply 4) Divide 5): Exit ");
		Scanner userOp=new Scanner(System.in);
		int operation=userOp.nextInt();
	
	System.out.print("Choose your first number below: ");
		Scanner userNum1=new Scanner(System.in);
		int num1=userNum1.nextInt();
		
	System.out.print("Choose your second number below: ");
		Scanner userNum2=new Scanner(System.in);
		int num2=userNum2.nextInt();
		
		switch(operation) {
		case 1:
			System.out.print(num1 + " + " + num2 + " = " + (plusMethod(num1,num2)))	;
			break;
			
		case 2: 
			System.out.print(num1 + " - " + num2 + " = " + (subMethod(num1,num2)))	;
			break;
			
		case 3: 
			System.out.print(num1 + " x " + num2 + " = " + (multMethod(num1,num2)))	;
			break;
			
		case 4:
			System.out.print(num1 + " ÷ " + num2 + " = " + (divMethod(num1,num2)))	;
			break;
			
		case 5: 
			System.exit(0);
			
			break;
		default: 
			System.out.print("Invalid entry. Try again! ");
			break;
		}

		userNum1.close();
		userOp.close();
		userNum2.close();
	}

}
