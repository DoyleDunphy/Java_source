package pack2;

public class Ex02__Main {
	public static void main(String[] args) {
		Ex02_Programmer programmer1 = new Ex02_Programmer();
		System.out.println("보유기술 : "+programmer1.spec);
		programmer1.displayData();
		
		programmer1.nickName="웹 전문가"; //public 멤버필드이므로 외부에서 값을 수정
		programmer1.displayData();
		programmer1.spec="1종 보통 운전면허"; //default 멤버필드이므로 외부에서 값을 수정
		programmer1.displayData();
		//캡슐화 된 멤버를 해당 클래스 밖에서 제어하기 : getter, setter
		
		
		System.out.println("===============");
		Ex02_Programmer programmer2 = new Ex02_Programmer();
		programmer2.displayData();
		
		int nai =programmer1.getAge(); //public 메소드이므로 접근 가능
		System.out.println("programmer1 객체의 age :"+ nai);
		
		programmer1.setAge(33); //public 메소드 setter를 이용해 private 필드의 값을 전달
		System.out.println("programmer1 객체의 age :"+ programmer1.getAge());
		programmer1.displayData();
		programmer1.setAgeEx(55, 123);
		
		System.out.println("static, final 관련---");
		System.out.println("motto : "+programmer1.motto);
		System.out.println("motto : "+Ex02_Programmer.motto); //static 멤버는 클래스명.멤버 형태로 접근한다
		
		//programmer1.weight=77.8; // error:weight는 final이므로 수정 불가. 참조만 가능
		
		System.out.println("weight: "+ programmer1.WEIGHT);
		System.out.println("PI: "+Ex02_Programmer.PI); //static으로 선언되었다면 클래스명으로도 호출 가능
	
		
		System.out.println("\n=======================================");
		
		Ex02_Programmer Programmer2 = new Ex02_Programmer(); //새로운 객체 생성
		programmer2.displayData();
		
		System.out.println("\n객체 변수가 참조하는 주소에 대해(참고)...");
		System.out.println(programmer1.toString()+" "+programmer2.toString());
		System.out.println(programmer1.hashCode()+" "+programmer2.hashCode());
		
		System.out.println("-----전문가가 만든 클래스 경험-----");
		System.out.println(Integer.MAX_VALUE); //final(대문자) , static(필기체)
		
	}
}
