package pack4;

// public class Ex25_Ball implements Ex24_Flyer{ // 모든 메소드 오버라이딩해야함
public class Ex25_Ball extends Ex25_FlyerAdapter{ // 선택적으로 오버라이딩 가능

	public void fly() {
		System.out.println("아구공이 힘차게 관중석으로 날아감");
	}
	
	//isAnimal()은 현재 클래스에서는 필요없다고 판단되기에 오버라이딩을 하지 않음
}
