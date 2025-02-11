package pack4;

public class Ex15__Bicycle extends Ex15__Vehicle{
	public int gearCount;
	
	public Ex15__Bicycle(String brand , int gearCount) {
		this.brand = brand;
		this.gearCount = gearCount;
	}
	
	public void describe() {
		System.out.println("This is a bicycle of brand "+brand+" with "+gearCount+" gears");
		
	}

	}


