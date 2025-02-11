package pack3;
import java.util.Scanner;

public class Ex10_CoinIn {

	class Machine {
	    // Machine 클래스의 cupCount 변수: 커피 한 잔에 대한 가격 계산에 사용됨
	    private int cupCount;

	    // 생성자, 초기 컵 수를 0으로 설정
	    public Machine() {
	        cupCount = 0;
	    }

	    // 커피 가격 정보 출력 메소드
	    public void showData() {
	        System.out.println("커피 한 잔에 대한 요금은 200원입니다.");
	    }

	    // 커피 요금 계산 메소드 (가격은 200원으로 고정)
	    public int getCoffeePrice() {
	        return 200;
	    }
	}
}
