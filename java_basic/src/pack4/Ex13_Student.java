package pack4;

public class Ex13_Student extends Object {   // 모든 클래스는 Object를 상속받음
	public String name;
	
	public Ex13_Student() {
		name = "tom";
	}
	
	@Override
	public String toString() {
		System.out.println("원래 의미 싫어. 바꿀거야");
		return "이 클래스의 사용자는 "+ name;
	}
	
//-------------------------------------------------	
	public static void main(String[] args) {
		Ex13_Student student = new Ex13_Student();
		System.out.println(student); // student는 student.toString의 줄임말이기 때문에 오버라이드 된 toString에서 값을 바꾸면 바뀐대로 값이 출력됨
		System.out.println(student.toString());
	}
}
