package pack4;

public class Ex17_PolyMain {
	public static void main(String[] args) {
		Ex17_PolyCar car1 = new Ex17_PolyCar();
		Ex17_PolyBus bus1 = new Ex17_PolyBus();
		Ex17_PolyTaxi taxi1 = new Ex17_PolyTaxi();
		
		System.out.println();
		car1.dispData();
		System.out.println(car1.getSpeed());
		
		System.out.println("\n버스에 대해 ...");
		bus1.dispData();
		System.out.println(bus1.getSpeed());
		bus1.show();
		
		System.out.println("\n택시에 대해 ...");
		taxi1.dispData();
		System.out.println(taxi1.getSpeed());
		
		System.out.println("\n-------주소치환-------");
		Ex17_PolyCar car2 = new Ex17_PolyBus(); // 자식의 주소를 부모에게 치환
		car2.dispData();
		// car2.show(); // 자식 (bus) 의 고유 메소드이기떄문에 불가
		
		System.out.println();
		Ex17_PolyCar car3 = taxi1; // 자식의 주소를 부모에게 치환
		car3.dispData();
		
		System.out.println("\n-------다형성-------");
		//Ex17_PolyBus bus2 = new Ex17_PolyCar(); // 부모 타입의 객체를 자식에게 줄 수 x
		Ex17_PolyBus bus2 = (Ex17_PolyBus)car2; // 부모타입이지만 자식의 주소를 가지므로 캐스팅 가능
		bus2.dispData();
		bus2.show();
		
		System.out.println();
//		Ex17_PolyTaxi taxi2 = new Ex17_PolyCar();  //불가능
		Ex17_PolyTaxi taxi2 = (Ex17_PolyTaxi)car3;
		taxi2.dispData();
		
//		Ex17_PolyTaxi taxi3 = (Ex17_PolyTaxi)car1; // ClassCastException err
		
		
		System.out.println("------------------");
		Ex17_PolyCar p[] = new Ex17_PolyCar[3]; // Car 타입의 배열선언
		p[0] = car1;
		p[1] = bus1;
		p[2] = taxi1;
		p[0].dispData();
		p[1].dispData();
		p[2].dispData();
		System.out.println();
		for(int i=0; i<p.length; i++) {
			p[i].dispData();
		}
			System.out.println();
			for(Ex17_PolyCar car : p) {
				car.dispData();
			}
		
	}

}



