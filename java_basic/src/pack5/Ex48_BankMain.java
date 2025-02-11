package pack5;

public class Ex48_BankMain {
	public static Ex48_Bank hanaBank = new Ex48_Bank();

	public static void main(String[] args) {
		
		// 스레드 동기화
		// 공유 자원에 Lock 을 걸어 하나의 스레드가 공유 자원을 사용 중인 경우 달느 스레드는 공유자원을 사용하지 못하고 대기상태에 빠트릴 수 있다
		// synchronized 이용( 내부적으로 Lock )
		System.out.println("원금 : "+hanaBank.getMoney());
		
		Ex48_Park park = new Ex48_Park();
		park.start();
		
		Ex48_ParkWife wife = new Ex48_ParkWife();
		wife.start();
	}

}
