package pack3;

import java.awt.Frame;

public class Ex09_FramePoham {
	String name = "신기해";
	private Frame frame;  // 외부 클래스를 사용
	
	public Ex09_FramePoham() {
		frame = new Frame("포함 연습용");  // 클래스의 포함관계
		
//		frame.setSize(500,300);  // 너비와 높이 지정
//		frame.setLocation(150, 200); // 좌표 지정
//		frame.setVisible(true); 
	}
	
	//생성자는 초기화 및 전체 윤곽만 적고, 나머지(처리 로직)는 별도 메소드로 작성하는 것이 좋다
	public void frameVisible() {
		frame.setSize(500,300);  // 너비와 높이 지정
		frame.setLocation(150, 200); // 좌표 지정
		frame.setVisible(true); 
	}
	
	public static void main(String[] args) {
		//new Ex09_FramePoham();  // 생성자에서 모든 일이 처리되므로 객체변수가 굳이 필요하지 않다
//		Ex09_FramePoham framePoham = new Ex09_FramePoham();
//		framePoham.frameVisible();
		// 위 두 줄을 한 줄로 표현
		new Ex09_FramePoham().frameVisible();
	}

}
