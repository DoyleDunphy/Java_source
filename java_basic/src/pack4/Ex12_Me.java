package pack4;

public final class Ex12_Me extends Ex12_Father { // 다중 상속은 불가능
	// class 자체에 final (상수) 사용 시 자식 클래스 생성 불가
	public Ex12_Me() {
		System.out.println("내 생성자");
	}
	
	@Override
	public void say() {
		System.out.println("인생은 아름다워");
		super.say(); // Me에서 super를 기재하면 father 클래스를 참조
	}

	public	final void Biking() { // Me의 자식 클래스는 Biking() override 불가
		System.out.println("자전거로 전국일주");
	}
}
