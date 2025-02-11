package pack4;

public class Ex22_Main {

	public static void main(String[] args) {
		Ex22_InterRadio interRadio = new Ex22_InterRadio();
		interRadio.volUp(5);
		interRadio.volDown(3);
		interRadio.showRadio();
		
		System.out.println();
		
		Ex22_InterTv interTv = new Ex22_InterTv();
		interTv.volResume();
		interTv.volUp(8);
		interTv.volDown(3);
		interTv.volOff();
		

	}

}
