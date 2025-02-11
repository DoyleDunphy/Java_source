package pack2;

public class Ex04_Exam2 {
	
	public Ex04_Exam2() {
	
	}
	public void printAge(String irum, int nai) { //매개변수에는 기본형, 참조형 둘 다 사용가능
		System.out.println("이름은 "+irum+"이고 나이는 "+nai+"입니다");
	}
	public void printAge(String irum) {
		System.out.println("이름은 "+irum+"이고 나이는 알 수 없습니다");
	}
	public void printAge() {
		System.out.println("이름과 나이를 알 수 없습니다");
	}
	
	
	
	public static void main(String[] args) {
		Ex04_Exam2 exam2 = new Ex04_Exam2();
		exam2.printAge("김치국",33);
		exam2.printAge("공기밥");
		exam2.printAge();
	}

}
