package homework;


public class Student extends Person implements PersonInterface {
	String school;
	String major;
	String grade;

public Student(String name, int age, String gender, String school, String major, String grade ) {
		super(name, age, gender);
		this.school = school;
		this.major = major; 
		this.grade = grade;
	}

@Override
public String toString() {
	return "\nName: "+ name+ "\nAge: " + age +"\nGender: "+gender+"\nSchool: "+ school+ "\nMajor: " + major +"\nGrade: " + grade+"\nYears till Retirement: " + calculate(age)+"\nLife Expectancy: " + compute(age);
}

@Override
public double calculate(int age) {
	int retirement = 65 - age;
	return retirement;
}

@Override
public double compute(int age) {
	double lifeExpectancy = 78.79 - age;
	return lifeExpectancy;
}



	
	
	
	
	
	
}
