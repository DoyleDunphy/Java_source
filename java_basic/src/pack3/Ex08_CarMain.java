package pack3;

public class Ex08_CarMain {
	public static void main(String[] args) {
		Ex08_PohamCar tom = new Ex08_PohamCar("톰");		
		tom.driveTurnHandle(20);
		System.out.println(tom.ownerName + "의 회전량은 " + tom.turnShow + " " + tom.handle.quantity);
		
		tom.driveTurnHandle(0);
		System.out.println(tom.ownerName + "의 회전량은 " + tom.turnShow + " " + tom.handle.quantity);
		
		// 새로운 자동차 객체 생성
		Ex08_PohamCar oscar = new Ex08_PohamCar("오스카");
		oscar.driveTurnHandle(-10);
		System.out.println(oscar.ownerName + "의 회전량은 " + oscar.turnShow + " " + oscar.handle.quantity);
	
	
	}

}
