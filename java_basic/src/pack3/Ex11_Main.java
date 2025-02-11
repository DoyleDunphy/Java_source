package pack3;

public class Ex11_Main {
	public static void main(String[] args) {
		// Book 객체 생성
		Ex11_Book myBook=new Ex11_Book("자바 클래스 활용", "박치기");
	
		// Student 객체 생성
		Ex11_Student tom = new Ex11_Student("미스터톰", myBook);
		tom.showStudentDetail();
	}

}
