package pack5;

public class Ex48_Park extends Thread { // 은행을 이용하는 박씨 클래스
	public void run() {
		Ex48_BankMain.hanaBank.saveMoney(5000);
		System.out.println("남편 예금 후 잔고 : " + Ex48_BankMain.hanaBank.getMoney());
		
	}
	
}
