package pack2;

// Method Overloading : 클래스 내에 동일 이름의 메소드를 복수로 만듦
public class Ex04_Animal { //동물이 가져야 할 속성(Field)과 행위(Method)를 클래스로 설계
	private int leg = 4;
	private int age;
	private String name;
	public final static int MOUTH = 1;
	
	public Ex04_Animal() {
		// 생성자에 내용을 적어두지 않으면 컴파일러가 자동으로 만들어 줌
		System.out.println("내용이 없는 생성자");
	}
	
	public Ex04_Animal(int leg) { //생성자 오버로딩
		this.leg=leg;
		System.out.println("정수 1개를 받는 생성자");
	}
	
	public Ex04_Animal(String name, int age) { //생성자 오버로딩
		this.name=name;
		this.age=age;
		System.out.println("2개의 매개변수를 받는 생성자");
	}

	public void display() {
		System.out.println("leg: "+leg+" age: "+age+" name: "+ name);
	}
	
	// 오버로딩 성립조건 : 매개변수의 개수,순서,타입이 다르면 가능
	public void display(int age) { // 메소드 오버로딩
		//this.age=age;
		System.out.println("leg: "+leg+" age: "+age+" name: "+ name);
	}
	public void display(String name) { //= 타입이 다름
		System.out.println("leg: "+leg+" age: "+age+" name: "+ name);
	}
	
	public void display(int age,String name) { // = 개수가 다름
		System.out.println("leg: "+leg+" age: "+age+" name: "+ name);
	}
	public void display(String name,int age) { // =  순서가 다름
		System.out.println("leg: "+leg+" age: "+age+" name: "+ name);
	}
	
	/*오버로딩 성립이 되지않는 경우
	*1 public void display(int leg) { * 개수와 타입이 같음 (위 int age가 있기 때문에)
		System.out.println("leg: "+leg+" age: "+age+" name: "+ name);
		}
	*2 public void display(String name,int leg) {
		System.out.println("leg: "+leg+" age: "+age+" name: "+ name);
		}
	*3 private int display(int leg) { 
		System.out.println("leg: "+leg+" age: "+age+" name: "+ name);
   		return 5;
		}

	*/
	
	
	}
	
	
	
	
	
	
	
		

