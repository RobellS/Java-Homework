package homework;

public class Starter {

	public static void main(String[] args) {
		
		Computer comp1 = new Computer();
		Computer comp2 = new Computer();
		Computer comp3 = new Computer();
				
		
		comp1.setCompName("Apple Macbook Air");
		comp1.setCompYear(2020);
		comp1.setCompCost(1200);
		
		comp2.setCompName(" Dell XPS 17 ");
		comp2.setCompYear(2017);
		comp2.setCompCost(2000);
		
		comp3.setCompName("Toshiba Satellite");
		comp3.setCompYear(2014);
		comp3.setCompCost(1000);
				
		
		comp1.getCompName();
		comp1.getCompYear();
		comp1.getCompCost();
		comp1.Upgrade(comp1.getCompYear());
		System.out.println("\n");
		
		comp2.getCompName();
		comp2.getCompYear();
		comp2.getCompCost();
		comp2.Upgrade(comp2.getCompYear());
		System.out.println("\n");
		
		comp3.getCompName();
		comp3.getCompYear();
		comp3.getCompCost();
		comp3.Upgrade(comp3.getCompYear());
		System.out.println("\n");
		

	}

}
