package pack4;

// parent , super , 부모 , 원형 , 상위 클래스
public class Ex17_PolyCar { // 모든 자동차들이 공통으로 가져야 할 멤버(필드,메소드) 선언
	protected int speed = 100;
	
	public Ex17_PolyCar() {
		System.out.println("나는 자동차 원형 클래스야");
	}
	
	public void dispData() {
		System.out.println("속도 : "+speed);
	}
	
	public int getSpeed() {
		return speed;
	}
}
