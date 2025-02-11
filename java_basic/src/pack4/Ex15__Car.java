package pack4;

public class Ex15__Car extends Ex15__Vehicle{
	public int fuelCapacity;
	
	Ex15__Car(String brand,int fuelCapacity){
		this.brand= brand;
		this.fuelCapacity=fuelCapacity ;
		
	}
	public void describe() {
		System.out.println("This is a car of brand "+ brand+" with a fuel capacity of "+fuelCapacity+" liters");
	
	}
	}

