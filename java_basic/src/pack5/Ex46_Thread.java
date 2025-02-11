package pack5;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

// 하나의 프로그램은 하나의 Process 에 해당한다.
// 이러한 process 를 실제로 실행하기 위한 실행단위를 Thread 라고 한다
// Thread 하나는 한 개의 실행을 담당하므로 결국 여러 개의 Thread 를 이용하면 여러 개의 작업(task)을 할 수 있게된다
// single thread 는 single tasking, multi thread 는 multi tasking 을 하게 된다
// 여러 개의 응용 프로그램을 실행하고 싶을 때 또는 네트워크 작업을 효율적으로 운영하려면 스레드 처리는 필수적이다

public class Ex46_Thread implements Runnable{
	Ex46_Thread(){
		
	}
	
	public Ex46_Thread(String name) {
		Thread tt = new Thread(this,name);
		tt.start();
	}
	@Override
	public void run() {
		// start()에 의해 호출되며 run 처리가 끝나면 스레드 작업이 종료됨
		for(int i=0; i<=50; i++) {
			System.out.println(i+Thread.currentThread().getName());
			try {
				Thread.sleep(100); // sleep(1000) = 1초
			} catch (Exception e) {
				
			}
		}
	}
	
	public static void main(String[] args) { // 기본적으로 모든 프로그램은 main 스레드가 자동실행된다
		//사용자 정의 스레드를 사용하지 않은 경우
//		Ex46_Thread my1 = new Ex46_Thread();
//		Ex46_Thread my2 = new Ex46_Thread();
//		my1.run(); // 처음 요청이 모두 처리되면
//		my2.run(); // 다음 요청이 처리됨
		
		//사용자 정의 스레드를 사용한 경우
		//첫번째 생성자 호출
		Ex46_Thread my1 = new Ex46_Thread();
		Ex46_Thread my2 = new Ex46_Thread();
		Thread t1 = new Thread(my1,"하나");
		Thread t2 = new Thread(my2,"둘");
		t1.start();   // run 메소드 호출
		t2.start();
		
		t2.setPriority(9);  // 스레드 스케쥴러에 우선순위 요청 ( 반드시 적용x )
		
		
//		new Ex46_Thread("하나"); // 스레드 스케쥴러에 의해 순차적인 처리가 아닌 랜덤으로 요청처리
//		new Ex46_Thread("둘");
		System.out.println("프로그램 종료");
		
		
}
}
