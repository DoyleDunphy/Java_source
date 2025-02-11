package pack4;

public class Ex24_FlyerMain {

	
	
	public static void main(String[] args) {
		// 인터페이스의 추상 메소드는 모두 오버라이딩 해야 함
		System.out.println(Ex24_Flyer.FAST);
		// Ex24_Flyer.FAST = 150; // final 값이기 때문에 수정불가
		
		Ex24_FlyerBird bird = new Ex24_FlyerBird();
		bird.fly();
		
		Ex24_FlyerAirplane airplane = new Ex24_FlyerAirplane();
		airplane.fly();
}
}
