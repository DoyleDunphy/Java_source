package pack5;

public class Ex49_BreadEater extends Thread{
	private Ex49_BreadPlate breadPlate;
	
	Ex49_BreadEater(Ex49_BreadPlate breadPlate){
		this.breadPlate = breadPlate;
	}
	
	@Override
	public void run() {
		for(int i=0; i<30; i++) { //하루에 빵 소비는 30회만
			breadPlate.eatBread();
		}
	}
}
