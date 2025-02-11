package pack4;

public class Ex16_HouseDog extends Ex16_Dog {
	private String where = "집";
	
	public Ex16_HouseDog(String name){
		super(name);
	}
	
	public void show() {
		System.out.println("어디 사니? " + where + "에 산다");
	}
	
	@Override
	public void print() {
		System.out.println(getName() + " : " + where + " 에서 잘 지내고 있어");
	}
	
	public void displayPrint() {
		print();
		this.print();
		super.print();
	}
}
