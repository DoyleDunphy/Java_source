package pack2;

public class Ex02_Student {
	//필드
	private String name;
	private int grade;
	private double score;
	
	//생성자
		//public Ex02_Student(String name, int grade, double score) {
		//this.name="Tom";
		//this.grade=1;
		//this.score=2.34; //this를 포함하지 않는 것이 더 낫다
		//}
	public Ex02_Student(String a, int b, double c) { //매개변수는 지역변수
		name=a;
		grade=b;
		score=c;
	}

	//메소드
	public void printStudent() {
		//string name = "James"; = 지역변수가 우선
		System.out.println("이름: "+name+", 학년: "+grade+", 평균점수: "+score);
	}
	//setter를 이용해서 값을 줄수도있다
	public void setScore(double score) {
		this.score=score;
	}
	public void setName(String name) {
		this.name=name;
}
	// main 메소드는 프로그램을 실행하기 위한 메소드. Ex02_Student 멤버는 아니다
	public static void main(String[] args) {
		Ex02_Student tom= new Ex02_Student("톰", 3, 85.5);
		tom.printStudent();
		
		System.out.println();
	Ex02_Student james = new Ex02_Student("제임스", 1, 95.5);
	james.printStudent();
	james.setScore(66.8);
	james.printStudent();
	james.setScore(90.0);
	james.printStudent();
	}

}