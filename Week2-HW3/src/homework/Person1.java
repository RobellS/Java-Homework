package homework;

public class Person1 implements PersonInterface{
private String pname;
private int page;
private String pgender;



public Person1(String name, int age, String gender)
{
this.pname=name;
this.page = age;
this.pgender=gender;
}



public String getPname() {
	return pname;
}



public void setPname(String pname) {
	this.pname = pname;
}



public int getPage() {
	return page;
}



public void setPage(int page) {
	this.page = page;
}



public String getPgender() {
	return pgender;
}



public void setPgender(String pgender) {
	this.pgender = pgender;
}



@Override
public String toString() {
	return "\nName: " + this.getPname() + "\nAge: " + this.getPage() + "\nGender: " + this.getPgender() +"\nYears till Retirement: "+ calculate(getPage())+ "\nLife Expectancy: "+ compute(getPage());
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
