package pack4;

public class Ex16_DogMain {

	public static void main(String[] args) {
		Ex16_Dog dog = new Ex16_Dog("개");
		dog.print();
		System.out.println(dog.callName());
		
		System.out.println();
		Ex16_HouseDog houseDog = new Ex16_HouseDog("집개");
		houseDog.print();
		System.out.println(houseDog.callName());
		houseDog.show();
		
		System.out.println();
		Ex16_WolfDog wolfdog = new Ex16_WolfDog("늑대");
		wolfdog.print();
		System.out.println(wolfdog.callName());
		wolfdog.show();
		
		System.out.println("------");
		Ex16_WolfDog bushdog = wolfdog; // 주소를 치환 ( 타입이 같은 경우 치환 성공 )
		wolfdog.print();
		bushdog.print();
		
		// promotion
		Ex16_Dog dog2 = wolfdog; // 주소를 치환 ( 타입이 다른데도 불구하고 치환 성공 - 자식의 주소를 부모 객체변수에 주는 경우 )
		dog2.print(); // overriding 된 메소드만 부모 객체변수명으로 호출 가능
		//dog2.show(); // 자식이 가진 고유 메소드는 부모 객체변수명으로 호출할 수 있다
		//Ex16_WolfDog hidog = dog2; //type mismatch err
		Ex16_WolfDog hidog = (Ex16_WolfDog)dog2; // casting
		hidog.print(); 
		
		System.out.println("----------------");
		Ex16_Dog coyote = new Ex16_Dog("코요테"); // Dog의 부모 클래스 ( Super class )
		coyote.print();
		System.out.println(coyote.callName());
		
		Ex16_WolfDog wolfDog2 = new Ex16_WolfDog("늑대2"); // Dog의 자식 클래스
		wolfDog2.print();
		wolfDog2.show();
		
		coyote = wolfDog2; // promotion : 자식 객체 주소를 부모 객체변수에 치환
		coyote.print(); // 오버라이딩 된 메소드는 허용
		//coyote.show();  // 자식 고유 메소드는 호출 불가
		coyote.getName(); 
		Ex16_WolfDog wolfDog3 = null;
		//wolfDog3.show(); // NullPointerException Err
		wolfDog3 = wolfDog2; // 타입이 같으므로 성공
		//wolfDog3 = houseDog; // 타입이 다르므로 실패
		//wolfDog3 = coyote; // 타입이 달라 실패지만 부모 타입인 coyote 변수는 자식의 주소를 기억 중
		wolfDog3 = (Ex16_WolfDog)coyote; // 그러므로 casting 을 통해 치환할 수 있다.
		
	}

}
