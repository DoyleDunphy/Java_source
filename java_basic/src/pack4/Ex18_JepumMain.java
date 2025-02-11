package pack4;

public class Ex18_JepumMain {
	public static void main(String[] args) {
		// 추상 클래스는 스스로 객체 생성 불가 , 자식의 생성자에 의해 객체 생성된다
//		Ex18_Jepum jepum = new Ex18_Jepum; // Cannot instantiate the type err
		Ex18_Jepum jepum = null;
		
		Ex18_JepumTv tv = new Ex18_JepumTv();
		tv.volumeControl();
		tv.volumeShow();
		
		System.out.println();
		Ex18_JepumRadio radio = new Ex18_JepumRadio();
		radio.volumeControl();
		radio.volumeShow();
		
		System.out.println();
		Ex18_JepumPhone phone = new Ex18_JepumPhone();
		phone.volumeControl();
		phone.volumeShow();
		
		System.out.println();
		jepum = phone; // 자식의 주소를 부모에게 치환
		jepum.volumeControl();
		System.out.println();
		jepum = radio;
		jepum.volumeControl();
		System.out.println();
		jepum = phone;
		jepum.volumeControl();
		
		System.out.println("-------");
		Ex18_Jepum j[] = {tv,radio,phone};
		for(Ex18_Jepum jep: j) {
			jep.volumeControl();
		}
	}
}
