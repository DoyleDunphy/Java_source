package pack3;

public class Ex08_PohamCar { // 여러 개의 부품 클래스를 불러다가 완성차를 생산하기 위한 클래스
	int speed=0;	// PohamCar 고유 멤버
	String ownerName; // PohamCar 고유 멤버
	String turnShow; // PohamCar 고유 멤버
	
	// 클래스의 포함관계(has a)
	//Ex08_Handle handle = new Ex08_Handle(); // 외부 클래스를 현재 클래스의 멤버처럼 사용하기 위함
	Ex08_Handle handle;
	// 엔진, 타이어, 램프 등등 을 클래스에 포함관계로 호출해서 사용, 객체지향적인 프로그래밍(oop) 철학

	public Ex08_PohamCar() {
		
	}
	
	public Ex08_PohamCar(String ownerName) {
		this.ownerName = ownerName;
		handle = new Ex08_Handle();
	}
	
	void driveTurnHandle(int q) { // q = quantity(회전량)
		if(q > 0) turnShow = handle.rightTurn(q);
		if(q < 0) turnShow = handle.leftTurn(q);
		if(q == 0) turnShow = handle.straight(q);
	}
	
}
