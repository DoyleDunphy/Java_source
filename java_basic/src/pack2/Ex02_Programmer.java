package pack2;

public class Ex02_Programmer {
	public String nickName; //초기값이 없으면 참조형이므로 null
	private int age; //초기값이 없으면 0 기억. 은닉화 된 필드(멤버변수, 전역변수)
	//private int age=0; //위와 같은 의미
	String spec="정보처리자격증";
	
	public static String motto="자바에 아름답게 미치자"; //정적 필드. static 영역에 저장
	
	public final double WEIGHT = 66.78; // final 멤버필드는 값 수정 불가
	public static final double PI = 3.14; // 정적 필드이고 수정 불가 // final 멤버필드의 필드명은 대문자로만 쓰기 권장
	
	
	Ex02_Programmer() {
		//생성자는 내용이 없는 경우에 생략하면 컴파일러가 내부적으로 만들어 준다
		System.out.println("난 생성자야. 객체 생성시 1회만 호출 가능");
		int number=20; //지역변수(메소드 내에서 선언한 변수는 메소드 내에서만 유효)
		age=number+5;
		nickName="에러잡는귀신";
	}
	
	public void displayData() {
		System.out.println("----");
		String mySpec = responseSpec(); //메소드가 다른 메소드를 호출
		System.out.println(mySpec);
		System.out.println("별명: "+nickName +", 나이는 "+age);

	}
	
	private String responseSpec() {
		return "내가 가진 기술은 " + spec;
		
	}
	
	//private 멤버 외부에서 제어하기 위한 메소드 작성. 캡슐화
	public int getAge() { //메소드 이름은 약속. get멤버변수(첫글자는 대문자) <== getter
		return age; //age 변수 자체를 반환하는 것이 아니라 age에 기억된 정수를 반환
	}
	public void setAge(int age) { //메소드 이름은 약속. set멤버변수(첫글자는 대문자) <== setter
		this.age=age; //class내에서 자신의 멤버를 지칭할 때 this를 붙힘
	}
		public void setAgeEx(int age, int password) {
			if(password==123) {
				this.age=age;
				System.out.println("age 수정 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다");
			
		}
			 	
		
		
		//은닉화 : 불필요한 정보를 숨기는 것. ex) private int age;
		//캡슐화 : 데이터와 메소드를 하나로 묶는 것. ex) public int getAge(){return age} // 캡슐화는 은닉화를 구현하는 가장 기본적인 방법
			
	
	}
}
