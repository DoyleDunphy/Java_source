package pack4;

public class Ex18_JepumTv extends Ex18_Jepum {
	Ex18_JepumTv(){
		System.out.println("TV 생성자");
	}
	
	@Override
	public void volumeControl() {
		// 메소드 오버라이드를 강요당함
		System.out.println("TV 소리 조절");
	}
}
