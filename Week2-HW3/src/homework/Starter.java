package homework;

import java.util.*;

public class Starter {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Are you a student or employee? 1) Student 2) Employee 3) New Person");
		int decision = userInput.nextInt();
		
		if(decision == 1 )
		{
			System.out.println("What is the name of the student?");
			String name = userInput.next();
			
			System.out.println("What is the age of the student?");
			int age = userInput.nextInt();
			
			System.out.println("What is the gender of the student?");
			String gender = userInput.next();
			
			System.out.println("Where does the student go to school?");
			String school = userInput.next();
			school+=" ";
			school+=userInput.next();
		
			
			System.out.println("What is the major of the student?");
			String major = userInput.next();
			major+=" ";
			major+=userInput.next();
			
			System.out.println("What is the grade of the student?");
			String grade = userInput.next();
			
			Student student1 = new Student(name, age, gender, school, major, grade);
			
			System.out.println(student1.toString());
			
		}
		
		else if (decision == 2)
		{
			System.out.println("What is the name of the employee?");
			String name = userInput.next();
			
			System.out.println("What is the age of the employee?");
			int age = userInput.nextInt();
			
			System.out.println("What is the gender of the employee?");
			String gender = userInput.next();
			
			System.out.println("Where does the employee work?");
			String company = userInput.next();
			company+=" ";
			company+=userInput.next();
			
			System.out.println("What is the position of the employee?");
			String position = userInput.next();
			position+=" ";
			position+=userInput.next();
		
			
			
			Employee employee1 = new Employee(name, age, gender, company, position);
			
			System.out.println(employee1.toString());
		}
		else if (decision == 3)
			{
				
			System.out.println("What is the name of the new person?");
			String name = userInput.next();
			
			System.out.println("What is the age of the new person?");
			int age = userInput.nextInt();
			
			System.out.println("What is the gender of the new person?");
			String gender = userInput.next();
			
			Person1 newPerson= new Person1(name, age, gender);
			
			System.out.println(newPerson.toString());
			
			
			}
			
		}
	}

