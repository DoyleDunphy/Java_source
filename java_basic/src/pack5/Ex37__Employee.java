package pack5;

public class Ex37__Employee {
	private int id;
	private String name;
	private int baseSalary;
	private int startYear;
	
	public Ex37__Employee(int id, String name, int baseSalary, int startYear) {
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
		this.startYear = startYear;
	}
	//근무년수 계산
	public int getWorkYears(int currentYear) {
		return currentYear - startYear;
	}
	//근속수당 계산
	public int getLoyaltyAllowance(int workYears) {
		if(workYears>=9) return 1000000;
		else if(workYears>=4)return 450000;
		else return 150000;
	}
	//공제액 계산
	public double getDeductions(int totalSalary) {
		double taxRate = (totalSalary>=3000000)?0.005:
			(totalSalary>=2000000)?0.003: 0.0015; // 삼항연산자
		return totalSalary*taxRate;
	}
	//최종 출력 데이터 생성
	public void printSalaryDetails(int currentYear) {
		int workYears = getWorkYears(currentYear);
		int loyaltyAllowance = getLoyaltyAllowance(workYears);
		int totalSalary = baseSalary + loyaltyAllowance;
		double deductions = getDeductions(totalSalary);
		double finalSalary = totalSalary - deductions;
		
		System.out.printf("사번: %d | 이름: %s | 근무년수: %d년 | 기본급: %,d원 | 공제액: %,d원 | 수령액 : %d원%n" ,
		id, name, workYears, baseSalary, loyaltyAllowance, totalSalary, (int)deductions,(int)finalSalary);
	

}
}

