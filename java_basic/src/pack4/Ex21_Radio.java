package pack4;

public class Ex21_Radio implements Ex21_Volume{  // 인터페이스는 implements 라는 예약어로 상속을 정의
	private int volLevel;
	
	public Ex21_Radio() {
		volLevel = 0;
	}
	
	@Override
	public void volumeUp(int level) {
		volLevel += level;
		System.out.println("라디오 볼륨 올리면 "+ volLevel);
		
	}@Override
	public void volumeDown(int level) {
		volLevel -= level;
		System.out.println("라디오 볼륨 내리면 "+ volLevel);
		
	}
}
