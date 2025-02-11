package pack2;

public class Ex04__Main {

	public static void main(String[] args) {
		System.out.println("메소드 오버로딩 연습");
		Ex04_Animal tiger = new Ex04_Animal();
		tiger.display();
		tiger.display(3);
		tiger.display("호랑이");
		tiger.display(5, "호랭이");
		tiger.display("호돌이", 2);
		
		System.out.println("\n생성자 오버로딩 연습");
		Ex04_Animal dog = new Ex04_Animal();
				dog.display();
				
		System.out.println();
		
		Ex04_Animal hen = new Ex04_Animal(2);
		hen.display();
		
		System.out.println();
		
		Ex04_Animal wolfdog = new Ex04_Animal("늑대", 7);
		wolfdog.display();
	
	
	}

}
