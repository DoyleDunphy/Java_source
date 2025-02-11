package pack5;

public class Ex48_ParkWife extends Thread { // 은행을 이용하는 박씨 부인 클래스
	public void run() {
		Ex48_BankMain.hanaBank.minusMoney(3000);
		System.out.println("박씨부인 예금 후 잔고 : " + Ex48_BankMain.hanaBank.getMoney());
		
		}

}
