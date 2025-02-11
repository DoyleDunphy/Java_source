package pack4;

public class Ex20_Temporary extends Ex20_Employee {
	private int ilsu;
	private int ildang;
	
	Ex20_Temporary(String irum, int nai, int ilsu , int ildang){
		super(irum, nai);
		this.ilsu = ilsu;
		this.ildang = ildang;
	}
	@Override
	public double pay() {
		return ilsu * ildang;
	}
	@Override
	public void print() {
		display();
		System.out.print(", 월급: " + pay());
		
	}
}
