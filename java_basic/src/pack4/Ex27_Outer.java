package pack4;

// 내부 클래스
// 클래스의 멤버로 필드 , 메소드 외에 클래스를 가질 수 있다. 이를 내부 클래스라고 한다
// 클래스 내에서 다른 클래스 객체를 사용해야 하는 경우가 있다. 이 때 구현하면 효과적이다
// 참고로 한 개의 클래스는 한 개의 extends 문을 가질 수 있다는 점을 기억해야 함

public class Ex27_Outer {
	private int kor;
	private Inner inner;
	
	Ex27_Outer(){
		kor = 10;
		inner = new Inner(); // 내부 클래스도 객체 생성은 포함관계처럼 해준다
	}
	
	public void aa() {
		System.out.println("외부 클래스 Outer의 aa 메소드 ");
		System.out.println("kor : "+ kor);
		bb();
		inner.cc();
		System.out.println("eng : "+ inner.eng); // 내부클래스의 변수를 부르려면 내부클래스명을 먼저 앞에 기재해야함
	}

	private void bb() {
		System.out.println("외부 클래스 Outer의 bb 메소드 실행");	
	}
	
	// 내부 클래스 선언
	public class Inner {
		private int eng;
		
		public Inner() {
			eng = 20;
		}
		
		public void cc() {
			System.out.println("내부 클래스 Inner의 cc 메소드");
			bb(); // 외부 클래스 Outer의 bb 메소드
			System.out.println("내부 eng :"+ eng + " , 외부 kor :" + kor);
		}
		
		// 내부 클래스 안에 다시 내부 클래스 선언 가능 ( 비권장 )
		public class InnerIner {
			
		}
	}
	
	public static void main(String[] args) {
		Ex27_Outer outer = new Ex27_Outer();
		outer.aa();
		outer.bb();
		
//		Inner inner = new Inner(); // 내부 클래스는 독립적인 객체생성(new) 불가능
//		Ex27_Outer.Inner inner = outer.new Inner(); // 이렇게 기재하는것은 가능하지만 비권장
//		inner.cc();
		
		System.out.println();
		
}
}
