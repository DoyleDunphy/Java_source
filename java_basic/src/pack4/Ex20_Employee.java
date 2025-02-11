package pack4;

abstract public class Ex20_Employee {
	private String irum;
	private int nai;
	
	Ex20_Employee(String irum, int nai){
		this.irum = irum;
		this.nai = nai;
	}
	
	abstract public double pay();
	abstract public void print();
	
	public void display() {
		System.out.print("이름: " + irum + ", 나이: " + nai);
	}
}
