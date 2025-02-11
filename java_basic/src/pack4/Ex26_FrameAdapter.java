package pack4;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex26_FrameAdapter extends WindowAdapter{ // 상속
	private Frame frame; // 클래스의 포홤관계
	
	Ex26_FrameAdapter(){
		frame = new Frame("어댑터 사용");
		frame.setSize(400,300);
		frame.setLocation(200, 200);
		frame.setVisible(true);
		
		frame.addWindowListener(this);
	}
	
	
	@Override
		public void windowClosing(WindowEvent e) { // 윈도우 이벤트 관련 메소드 중 원하는 메소드만 오버라이딩 가능해짐 + 색깔이 비어있으면 추상 , 채워져있으면 일반 메소드
			System.exit(0); // windowClosing ~ 따위를 이벤트 처리(핸들러) 메소드(함수)라고 부른다
		}
	
public static void main(String[] args) {
	new Ex26_FrameAdapter(); // 이벤트 발생으로 시스템이 메소드를 호출하는 경우 '콜백'한다고 한다

	}
}
