package pack4;

public class Ex20_Manager extends Ex20_Regular{
	private int inc;
	private int num;
	
	public Ex20_Manager(String irum, int nai, int salary) {
		super(irum, nai,salary);
	}
	
	public double pay() {
		double salary = super.pay();
		double bonus = 0;
		
		if (salary>=2500000) {
			bonus = salary*0.5;
		}else if (salary>=2000000) {
			bonus = salary*0.5;
		}else {
			bonus=salary*0.4;
		}
		return salary+bonus;
	}

public void print() {
	display();
	System.out.println(", 월급: "+pay());
	}
	
}
