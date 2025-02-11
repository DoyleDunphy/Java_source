package pack2;

//싱글톤 패턴이란
//객체의 인스턴스가 오직 1개만 생성되는 패턴을 의미한다
//장점: 메모리 절약, 데이터 공유 편리...
//단점: 유연함이 떨어짐, 디버깅과 테스트하기 힘듦
public class Ex06_Singleton {
	int kor=100;
	String name="tom";
	
	public Ex06_Singleton() {
		System.out.println("EX06_Sington 생성자");
	}	
	public void kbs() {
		System.out.println("kbs");
	}
	
	// 싱글톤 디자인 패턴
	private static Ex06_Singleton singleton= new Ex06_Singleton();
	
	public static Ex06_Singleton getInstance() {
		return singleton;
	}
}
