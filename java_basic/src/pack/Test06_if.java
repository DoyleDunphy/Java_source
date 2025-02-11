package pack;

import java.util.Scanner;

public class Test06_if {

	public static void main(String[] args) {
		// 조건 판단문 If
		System.out.println("뭔가를 수행 후 if문 만나기");
			int num = 7;
			
			if(num>=5) { //조건이 true
			
				System.out.println("계속1");
				
			System.out.println("크구나");
				System.out.println("진짜로 크네");
				
			}else { //조건이 false
				System.out.println("크지 않네");
			}
				
			System.out.println("계속2");
			
			int jumsu = 88;
			
			if(jumsu>=70) { System.out.println("보통");
				if (jumsu>=90)
				System.out.println("우수");
			}else {
				if(jumsu>=70) {System.out.println("우수");
		} else {
			System.out.println("저조"); 
		}
		
		if(jumsu>=50) { System.out.println("매우 저조");
			
		}
			}
			
System.out.println("--------------------------");

		int jumsu2 = 66;          //내림차순 , 마지막 코드는 생략권장
		String result = "";
		if(jumsu2>=90) {
			result = "수";
		}else if(jumsu2>=90) {
			result = "우";
		}else if(jumsu2>=70) {
			result = "미";
		}else if(jumsu2>=60) {
			result = "양";
		}else{ 
			result= "가";
		}
		System.out.println("평가 결과는"+" "+result);
	
		
		
		
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	// 어느 공원의 입장료가 8세 이하, 65세 이상인 경우 무료
	// 9세 이상 20세 미만인 경우 3000원 , 그 외는 5000원
		int age = 11;
		
		if (8>=age||65<=age) {
			System.out.println("free");
		}
		if (9<=age&&20>age) {
			System.out.println("3000원");
		}
		if (20<=age&&age<65) {
			System.out.println("5000원");
		}
	
		int price=0;
		if(9<=age&&20>age) {
			price=3000;
		}else if(20<=age&&age<65) {
			price=5000;
		}else {
			price=0;
		}
			System.out.println("입장료 :"+" "+price);
	
			
			System.out.println("___________________________");
			
	//로그인에 성공
			
String id = "doyle";
String pw = "q1w2e3r4";

	Scanner login = new Scanner(System.in);
		System.out.print("id :");
		String inputId = login.nextLine();
			System.out.print("pw :");
			String inputPw = login.nextLine();
			
			// if(inputId==id&&inputPw==pw) { // 기본형 비교
			if(inputId.equals(id)&&inputPw.equals(pw)) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
			
			
			
			}
	
	
	
		}
	




			
			
			

	


