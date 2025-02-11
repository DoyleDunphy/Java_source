package pack2;

public class Ex01_Car { // 클래스 형식 : [접근지정자] class 클래스명

		// Car 객체(Object)를 생산하기 위한 설계도 : 클래스
		// 새로운 type(형)을 만들기 위함
		// Field(속성)과 Method(행위)를 멤버로 가질 수 있다
		// 동일한 Field와 Method를 수행하는 객체의 집합을 설계
		
	int wheel;   // 멤버 필드(속성,전역변수) , 형식은 [접근지정자] type 필드명 , int wheel  = 0; (값을 지정하지 않으면 0으로 지정됨)
	// 접근 지정자 . default, private, public, protected
	private int airBag=1; //캡슐화:멤버 접근지정자가 private인 경우 , private = class 영역 내에서만 사용가능
	private int speed;
	public String irum; //public = " 다른 패키지에서도 호출가능
	
	public Ex01_Car() { // 특별한 메소드(클래스와 메소드명이 일치)==>생성자(constructor)는 1회만 호출가능
		System.out.println("객체 생성 시 생성자가 가장 먼저 수행 : 초기화를 담당");
		wheel=4;
		irum="그랜저"; 
	}
		public void abc() { //멤버 메소드 , 형식은 [접근지정자] 반환형 메소드명(매개변수...){}
			System.out.println("abc 메소드 실행");
			}
	
		void def() { // 메소드 수행 후 반환값이 없이 돌아갈 경우는 void
			System.out.println("def 메소드 실행");
			System.out.println("바퀴수는 "+wheel); //private 필드지만 Ex01_Car class 내부에서 호출했기때문에 호출가능
			System.out.println("에어백수는 "+airBag);  
			abc(); //private 메소드지만 Ex01_Car class 내부에서 호출했기때문에 호출가능
		}
		
		public String driving() { // 메소드 수행 후 String 타입의 반환값이 있는 경우는 문자열을 반환해줘야함
			System.out.println("운전하기");
			return "현재 고속도로를 달리는 중"; // 메소드 수행 후 값을 반환할 경우 return문을 사용한다
		}
		
		public int drivingstop() { // 메소드 수행 후 int 타입의 반환값이 있는 경우는 정수값을 반환해줘야함
			System.out.println("운전멈추기");
			return speed;    // return 정수 ? int 값을 받고 있기때문에
		}
	
		// 참고 : 변수에 값을 저장하는 방법은 두가지
		// 1) 변수=값 ,, ex : a=5;
		// 2) 매개변수를 이용 ,, ex : 메소드명(타입 매개변수){...} 하고 메소드명(값)
		public void drivingGood(int w) { // 매개변수(parameter)가 있는 메소드
			wheel = w;
			System.out.println(wheel+"개의 바퀴를 가진 이동수단 사용");
		}
	
// 클래스를 공부하는 이유
// 1) 직접 객체를 생성 후 사용하기 위해
// 2) 다른 사람이 만든 클래스를 활용하기 위해
	
	
	
		
	
	}


	

	
	



