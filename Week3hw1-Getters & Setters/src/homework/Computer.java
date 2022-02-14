package homework;

public class Computer {
	private static String compName;
	private int compYear;
	private int compCost;
	
	public String getCompName() {
		System.out.println("Name of Computer: "+compName);
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public int getCompYear() {
		System.out.println("Year of Computer: " + compYear);
		return compYear;
	}
	public void setCompYear(int compYear) {
		this.compYear = compYear;
	}
	public int getCompCost() {
		System.out.println("Computer cost: $" + compCost);
		return compCost;
	}
	public void setCompCost(int compCost) {
		this.compCost = compCost;
	}
	
	static void Upgrade(int y) {
		if (y > 2015){
			System.out.println("You have a good computer. No need to upgrade!");
		}
		else {
			System.out.println("You could use a computer upgrade.");
		}
	}

	

//	- Create a Computer class that has 3 variables. The first variable will have a name. The second variable will be the year of the computer. Last variable will be the cost of the computer.
//
//	- All 3 variables should be private instance variables and must use getters to retrieve the data and setters to set the variables.
//
//	- Create at least two POJOs and use their getters and setters in the main method of a Starter class
//
//	- Add at least one static method to your Computer class and give it some logic (be as creative as you like)


	

}
