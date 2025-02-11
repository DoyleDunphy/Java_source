package pack4;

public class Ex12_Father extends Ex12_GrandFa{ // extends 사용하면 부모 생성자부터 수행
	private final int nai=50; // nai 수정불가 (상수)
	public String gabo = "청자 비슷한 물병"; // 부모의 멤버와 겹치면 자식의 멤버가 우선시 됨
	private int house = 1;
	
	Ex12_Father(){
		super(); // 부모 생성자 호출 , 기재하지 않아도 기재한 것으로 간주
		System.out.println("아버지 생성자");
	}
	 
	@Override  // annotation (뭔가를 처리하는 기능)
		public int getNai() {
		// 메소드 오버라이딩 : 부모와 똑같은 메소드를 자식에서 만듦, 내용은 대개 다르게 적어도 된다
			int imsi=0; // 부모와 다른 코드를 적을 수 있다 (재정의)
			return nai;
	}
	@Override
		public void say() { 
			String ss = "아버지 말씀 : 풀스택 개발자로 고";
			System.out.println(ss);
		}
	public int getHouse() { // father 클래스의 고유 메소드이기 떄문에 annotation이 따로 나오지 않는다
		return house;
	}
	
	public void showData() {
		String gabo="맥북";
		System.out.println(gabo); // 지역을 우선으로 가까운 변수를 찾음
		System.out.println(this.gabo); // 지역무관 현재 클래스 안의 변수를 찾음
		System.out.println(super.gabo); // 처음부터 부모클래스에서 변수를 찾음
		
		say();
		this.say();
		super.say();
	}
}
