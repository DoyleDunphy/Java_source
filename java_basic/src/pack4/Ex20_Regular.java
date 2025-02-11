package pack4;

public class Ex20_Regular extends Ex20_Employee{
	private int salary;

	Ex20_Regular(String irum,int nai,int salary){
		super(irum,nai);
		this.salary = salary;
	}
	
	@Override
	public double pay() {
		return salary;
	}
	
	@Override
	public void print() {
		display();
		System.out.print(", 월급: " + pay());
		
	}
}
