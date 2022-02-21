package homework;



public class Employee extends Person implements PersonInterface {
	String company;
	String position;
	
//	
	public Employee(String name, int age, String gender, String company, String position) {
		super(name, age, gender);
		this.company = company;
		this.position = position; 
		
		
		

	}

	@Override
	public String toString() {
		return "\nName: "+ name+ "\nAge: " + age +"\nGender: "+gender+"\nCompany: " + company + "\nPosition: " + position + "\nYears till Retirement: " + calculate(age)+"\nLife Expectancy: " + compute(age) ;
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
