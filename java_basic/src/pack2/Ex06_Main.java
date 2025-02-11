package pack2;

import java.time.LocalDate;

public class Ex06_Main {

	public static void main(String[] args) {
		Ex06_Singleton ex1=new Ex06_Singleton();
		Ex06_Singleton ex2=new Ex06_Singleton();
		System.out.println(ex1 + " " + ex2); //두개의 객체변수(Instance) 주소가 다름
		System.out.println(ex1.name+" "+ex2.name);
		ex1.name = "홍길동";
		System.out.println(ex1.name+" "+ex2.name);
		
		System.out.println("싱글톤 패턴 적용");
		Ex06_Singleton my1=Ex06_Singleton.getInstance();
		Ex06_Singleton my2=Ex06_Singleton.getInstance();
		System.out.println(my1+" "+my2+" ");
		System.out.println(my1.name+" "+my2.name);
		my1.name = "한국인";
		System.out.println(my1.name+" "+my2.name);
		
		System.out.println(); // 싱글톤 패턴이 적용
		LocalDate localDate=LocalDate.now(); // static(필기체 , now)이 new를 하고있음
		LocalDate localDate2=LocalDate.now();
		System.out.println(localDate.hashCode()+" "+localDate2.hashCode());
		System.out.println(localDate);
		
		
	}

}
