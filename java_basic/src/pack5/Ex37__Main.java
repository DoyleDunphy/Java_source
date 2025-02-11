package pack5;

import java.util.ArrayList;
import java.util.List;

public class Ex37__Main {

	public static void main(String[] args) {
		int currentYear = 2025;
		
		//직원 리스트 생성
		
		List<Ex37__Employee> employees = new ArrayList<Ex37__Employee>();
		employees.add(new Ex37__Employee(1, "훈이", 1500000, 2005));
		employees.add(new Ex37__Employee(2, "맹구", 2300000, 2017));
	    employees.add(new Ex37__Employee(3, "철수", 1800000, 2021));
	    employees.add(new Ex37__Employee(4, "유리", 3200000, 2010));
	    employees.add(new Ex37__Employee(5, "짱구", 2900000, 2015));

	    // 급여 정보 출력
	    System.out.println("직원 급여 정보");
	    for (Ex37__Employee emp : employees) {
	    	emp.printSalaryDetails(currentYear);
	    }
	}

}
