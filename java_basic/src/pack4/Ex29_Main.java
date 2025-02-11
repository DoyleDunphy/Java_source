package pack4;

public class Ex29_Main {
	public static void main(String[] args) {
		Ex29_Saram saram = new Ex29_Saram();
		System.out.println(saram.getIrum());
		
		System.out.println();
		Ex29_GilDong gildong = new Ex29_GilDong();
		Ex29_Saram saram2 = gildong.getSaram();
		System.out.println(saram2.getIrum());
	}
}
