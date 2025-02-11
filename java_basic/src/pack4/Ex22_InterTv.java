package pack4;

public class Ex22_InterTv implements Ex22_InterVolume, Ex22_InterAdvancedVolume{
	private int v = 0;
	
@Override
public void volOff() {
	v = 0;
	System.out.println("TV소리 끄기");
}
	
@Override
public void volResume() {
	v = 1;	
	System.out.println("TV소리 켜기" + v);
}

@Override
public void volUp(int v) {
	this.v += v;
	
}

@Override
public void volDown(int v) {
	this.v -= v;
	
}

public void showRadio() {
	System.out.println("TV의 현재 볼륨은 " + v);
}
}
