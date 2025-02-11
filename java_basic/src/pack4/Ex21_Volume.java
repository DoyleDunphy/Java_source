package pack4;

/*
abstract public class Ex21_Volume {
	abstract public void volumeUp(int level);
	abstract public void volumeDown(int level);
}
*/

public interface Ex21_Volume {  // 인터페이스 : 추상 클래스의 다른 형태
	public void volumeUp(int level);
	public void volumeDown(int level);
	
//	public void print() {		
//		System.out.println("일반 메소드");
//	}							// 인터페이스는 일반메소드는 가질 수 없고 추상메소드만 가질 수 있다	
}