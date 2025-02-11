package pack4;

public class Ex20_EmployeeMain {
	public static void main(String[] args) {
		Ex20_Temporary tem = new Ex20_Temporary("홍길동",23,20,150000);
		tem.print();
		
		System.out.println();
		
		Ex20_Regular reg = new Ex20_Regular("신기해",25,2345000);
		reg.print();
		
		System.out.println();
		
		Ex20_Salesman sal = new Ex20_Salesman("손오공",27,2890000,30000,0.25);
		sal.print();
		
		Ex20_Manager man = new Ex20_Manager("사오정",33,4578000);
		man.print();
	}
}
