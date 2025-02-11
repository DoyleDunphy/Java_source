package java_basic2;

import pack2.Ex05_Bank;

public class Ex05_BankMain3 {
	public static void main(String[] args) {
		Ex05_Bank sujan=new Ex05_Bank();
		sujan.dePosit(5000);
		sujan.withDraw(1000);
		System.out.println("잔고는 "+sujan.getMoney());
	}
}
