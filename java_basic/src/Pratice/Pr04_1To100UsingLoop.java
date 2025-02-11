package Pratice;

public class Pr04_1To100UsingLoop {
public static void main(String[] args) {
	int sum = 0; // 합계를 저장할 변수
	for (int i = 1; i<=100; i++) { //1부터 100까지 sum에 i를 계속 더 해줌
		sum += i; //sum에 i를 계속 더해줌
	}
System.out.println("1부터 100까지의 합은: "+sum);	
	
}

}
