package pack4;

public class Ex29_GilDong {
	public Ex29_Saram getSaram() {
//		return new Ex29_Saram();
		
		return new Ex29_Saram() // 내부 무명(익명) 클래스
		{  
		public String getIrum() { // Ex29_Saram 클래스의 메소드를 오버라이딩
			String ir = "홍길동";
			return ir;
		}
	}; // 무명 클래스 마무리
	}
}
