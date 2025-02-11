package pack2;

// 매개변수로 기본형 뿐만 아니라 참조형도 가능
//public class Ex07_Parameter {
class Person{ // 일반적으로 따로이 파일을 작성해야 하지만 편의상 현재 클래스와 같은 곳에 적음
	String name;
	int age;
	
	public Person(String name, int age) { // String name:참조형(주소를 가지고 있음) , int age:기본형(값을 가지고 있음)
		this.name=name;
		this.age=age;
	}
}

class PersonService{
	PersonService(){
	}
		public void changeName(Person person, String newName) {
			System.out.println("person 변수기억주소: "+person);
			person.name=newName;
		}
	}
	
public class Ex07_Parameter {
	public static void main(String[] args) {
		Person tom=new Person("한국인", 22);
		System.out.println("변경 전 이름: "+tom.name);
		System.out.println("tom 변수기억주소: "+tom);
		Person james;
		james=tom;
		System.out.println("james 변수기억주소: "+ james);
	
		Person per=tom;
		System.out.println("per 변수기억주소: "+per);
		
		PersonService service=new PersonService();
		service.changeName(tom, "신나는"); // person 변수가 가진 주소를 전달
		System.out.println("변경 후 이름: "+tom.name);
	}

}

