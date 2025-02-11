package pack4;

public class Ex21_VolumeMain {

	public static void main(String[] args) {
//		Ex21_Volume myVolume = new Ex21_Volume();  // 불가능
		Ex21_Volume myVolume;
		
		Ex21_Radio radio = new Ex21_Radio();
		Ex21_Tv tv = new Ex21_Tv();
			
		radio.volumeUp(6);
		radio.volumeDown(3);
		
		tv.volumeUp(7);
		tv.volumeDown(2);
		
		System.out.println();
		myVolume = radio;
		myVolume.volumeUp(2);
		myVolume = tv;
		myVolume.volumeUp(2);
	}

}
