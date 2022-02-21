package homework;

public class Person {
String name;
int age;
String gender;



public Person(String n, int a, String g)
{
	this.name=n;
	this.age=a;
	this.gender=g;
}
	
public void display() 
{
	System.out.println("Name: "+ name);
	System.out.println("Age: "+ age);
	System.out.println("Gender: "+ gender);
}

}
