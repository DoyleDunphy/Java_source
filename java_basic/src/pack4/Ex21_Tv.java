package pack4;

public class Ex21_Tv implements Ex21_Volume{  // 인터페이스는 implements 라는 예약어로 상속을 정의
	private int volLevel;
	
	public Ex21_Tv() {
		volLevel = 0;
	}
	
	@Override
	public void volumeUp(int level) {
		volLevel += level;
		System.out.println("TV 소리 올리면 "+ volLevel);
		
	}@Override
	public void volumeDown(int level) {
		volLevel -= level;
		System.out.println("TV 소리 내리면 "+ volLevel);
		
	}
}
