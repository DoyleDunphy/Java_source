package pack4;

public class Ex22_InterRadio implements Ex22_InterVolume{
	private int v = 0;
	
@Override
public void volUp(int v) {
	this.v += v;
	
}@Override
public void volDown(int v) {
	this.v -= v;
	
}

public void showRadio() {
	System.out.println("라디오 현재 볼륨은 " + v);
}
}
