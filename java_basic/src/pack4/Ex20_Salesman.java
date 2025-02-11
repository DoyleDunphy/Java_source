package pack4;

public class Ex20_Salesman extends Ex20_Regular{
	private int result;
	private double comm;
		
	Ex20_Salesman(String irum, int nai, int salary, int result, double comm) {
		super(irum, nai, salary);
		this.result = result;
		this.comm = comm;
	}
	@Override
	public double pay() {
		return super.pay() + result*comm;
		}
	@Override
	public void print() {
		display();
		System.out.println(", 월급: "+pay());
	}
}


