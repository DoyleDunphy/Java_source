package pack3;

public class Ex08_Handle { // 완성차를 위한 부품, 핸들 클래스
	int quantity; // 회전량
	
	public Ex08_Handle() {
		quantity=0;
	}
	
	String leftTurn(int quantity) {
		this.quantity = quantity;
		return "좌회전";
	}
	
	String rightTurn(int quantity) {
		this.quantity = quantity;
		return "우회전";
	}
	
	String straight(int quantity) {
		this.quantity = quantity;
		return "직진";
	}
}
