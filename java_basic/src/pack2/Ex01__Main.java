package pack2;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex01__Main { //Ex01_Main은 main method를 실행하기 위한 class이다

	public static void main(String[] args) {
		// Main은 응용프로그램의 시작을 위해 정해진 메소드이다
		
		// Ex01_Car 설계도로 객체를 생성, 이런 과정을 객체를 인스턴스(instance)화 라고 한다
		// 다시말해 클래스로부터 객체를 만드는 과정을 클래스의 인스턴스화라고하며, 어떤 클래스로부터 만들어진 객체를 그 클래스의 인스턴스라고 한다
		// 객체는 모든 인스턴스를 대표하는 포괄적인 의미이다
		// 클래스 -- 인스턴스화 --> 객체
		
		// Ex01_Car.class를 주기억장치로 읽은 후 car1 객체변수를 선언
		// new 키워드로 인스턴스를 진행함, 이 때 Ex01_Car()라는 생성자를 호출
		// xxx.field=필드 . xxx.method()=메소드
		
		
Ex01_Car car1 = new Ex01_Car(); //보조기억장치에 있는 class 파일을 주기억장치로 끌어올림
		// Ex01_Car car1= new Ex01_Car(); //new는 인스턴스를 의미
		
		//*static,stack,heap*
		//참조형 변수 (객체변수,Instance variable)= 객체의 주소를 기억함
		//보조기억장치에 있는 Ex01_Car.class를 static으로
		//car1에 대한 변수값은 stack(객체의 주소를 기억)이 가지고 있음
		//heap에서는 객체(object)를 가지게 됨(객체의 주소를 stack에 저장)
		//car1=null; -> car1에 대한 주소를 삭제함
		
		//garbage collector(GC)=객체를 가지고 있는 heap의 변수값을 stack이 저장하고 있다가 null 시에 heap의 정보를 없애줌

//Ex01_Car 멤버필드(전역변수) 호출
System.out.println(car1.wheel); // (접근지정자가) default 이므로 때문에 호출 가능
//System.out.println(car1.airBag); //private 멤버이기때문에 호출 불가		
System.out.println(car1.irum); // 아무 인스턴스를 가지고 있지 않다면 null 출력

System.out.println();
//Ex01_Car 멤버메소드 호출
// car.abc(); // private 멤버이기때문에 호출 불가
car1.def();

System.out.println();

car1.driving(); // 반환값을 지정해주지 않았기때문에 반환값 무시하고 출력

System.out.println();

String ss = car1.driving();
ss = "와우 "+ss;
System.out.println(ss);
//위 두줄과 아래 한줄은 비슷한 기능을 수행함
System.out.println(car1.driving());

System.out.println();

car1.drivingGood(2); // 매개변수가 있는 메소드를 호출 객체변수.메소드명(인자(argument)) ,, 인자=인수라고도 부름
System.out.println("\n=======================================");

Ex01_Car car2 = new Ex01_Car(); // 새로운 객체 생성
// car1과 car2는 type이 같은 두 개의 객체 변수
System.out.println(car2.wheel);
car2.def(); // car1과 car2는 같은 형태의 변수지만 다른 변수이다
	}

}
