package pack5;

import java.io.FileNotFoundException;
import java.io.FileReader;

// 예외처리 : 키보드 입력 또는 파일 입출력 , 네트워크 , DB처리 등 외부 장치와 연결해 사용하는 경우
// 예기치 못한 장치에러가 발생할 수 있는데 이를 방지할 목적으로 사용한다
// 형식 : try{ } catch{ } finally{ }  <== 에러를 잡아서 예외를 처리
// throws 로 예외를 JVM에게 던져버릴 수도 있다

public class Ex31_Try {
	public String name = "tom";
	
	public void test() {
		try {
		int a[]= {1,2,3};
		//System.out.println("배열 값 출력 : " + a[1]);
		System.out.println("배열 값 출력: "+ a[5]);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("배열오류 = 지역이 우선함" + e);
	}
	}
	
	public void test2() throws Exception{ // 비권장
		FileReader fr2 = new FileReader("c:/work/kbs/txt");
	}
	
	public static void main(String[] args) {
		try {
				// 파일 작업은 강제로 예외처리를 요구
				// aa.txt가 없는 경우에만 catch 블럭을 수행
			FileReader fr = new FileReader("c:/work/aaa.txt");
		} catch (FileNotFoundException e) {
			System.out.println("파일 읽기 오류");
		}
		
		try {
//			int su = 0;  // 키보드로 변수값을 기억한다고 가정
			int su = 2;
			int result = 10 / su;
			System.out.println("result : " + result);
			
			Ex31_Try ex31_Try = new Ex31_Try();
//			Ex31_Try ex31_Try = null;
			System.out.println("이름은 "+ ex31_Try.name);
			
			ex31_Try.test();
			ex31_Try.test2();
			
		} catch (ArithmeticException e) {
			System.out.println("나누기 오류 : 0으로 나누기 불가");
		} catch (NullPointerException e) {
			System.out.println("참조변수 오류(변수가 주소를 참조하지 않습니다)" + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 참조 에러: " + e);
		} catch (Exception e) {
			System.out.println("위 catch 이외의 나머지 모든 오류는 여기서 처리");
			//Exception 을 가장 먼저 적으면 모든 예외처리는 exception 블록에서 처리 
		} finally {
			System.out.println("에러 유무에 상관없이 반드시 수행");
		}
		
		System.out.println("프로그램 종료");
	}
	
	

}

