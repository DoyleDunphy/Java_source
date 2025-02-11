package pack4;

public class Ex17_PolyTaxi extends Ex17_PolyCar{
	private int passenger = 2;
	
	public Ex17_PolyTaxi() {
		//super();
		System.out.println("난 Car의 자식인 Taxi 생성자입니다");
	}
	
	@Override
	public void dispData() {
		String msg = " 택시 안에 몇명이 타고 있니? "+passenger;
		System.out.println("택시 안에 몇명이 타고 있니? "+passenger);
	}
}
