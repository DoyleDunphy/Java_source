package pack4;

import java.awt.Frame;

public class Ex14_FrameSangsok extends Frame {

	public Ex14_FrameSangsok() {
		//super();
		super("상속 연습용");
	}
	
	public void frameVisible() {
		setSize(500, 300);
		//super.setSize(500,300);
		setLocation(200,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex14_FrameSangsok frameSangsok = new Ex14_FrameSangsok();
		frameSangsok.frameVisible();
	}
}
