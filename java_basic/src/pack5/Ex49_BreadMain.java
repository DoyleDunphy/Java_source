package pack5;

public class Ex49_BreadMain {
	public static void main(String[] args) {
		// 스레드 동기화 중 협력관계 처리
		// 스레드 간 협력 작업 중 스레드를 비활성화(wait()) 후 다시 활성화(notify()) 상태로 되돌리기 작업
		try { 
			Ex49_BreadPlate breadPlate = new Ex49_BreadPlate();
			
			Ex49_BreadMaker maker = new Ex49_BreadMaker(breadPlate);
			Ex49_BreadEater eater = new Ex49_BreadEater(breadPlate);
			maker.setPriority(9);
			maker.start();
			eater.start();
			
			System.out.println("현재 실행 중인 스레드 수 : " + Thread.activeCount());
		} catch (Exception e) {
			
		}
		
	}

}
