package pack;

public class Test03 {
	public static void main(String[] args) {
		// 산술 연산자
		int a = 5;   //=(대입연산자)의 기능 : a 변수에 리터럴 5를 기억시킴
		int b = 3;
		int c = a+b;
		System.out.println("c:"+c);
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); //몫만 표시되고 나머지는 생략
		System.out.println(a%b); //나눗셈 후 나머지만 표기
		System.out.println(a/(double)b); //몫+나머지_실수연산(double 생략 시 (int)정수 계산)
		
		System.out.println();
		//System.out.println(a/0);  // 불능, runtime error(실행오류)
		System.out.println(a/0.0);  // Infinity
		System.out.println(a%0.0);  // NaN (Not a number) 숫자가 아니라서 숫자로 표기불가
		
		System.out.println("산술연산자 우선순위");
		System.out.println(3+4*5);
		System.out.println((3+4)*5);
		
		System.out.println("문자열 더하기");
		String ss1 = "대한"; //String은 기본형이 아니라 참조형변수
		String ss2 = "민국"; //사용법은 기본형과 동일
		System.out.println(ss1+ss2); //문자열 더하기
		//System.out.println(ss1-ss2); // 불가
		
		System.out.println(ss2+""+2025);  // 정수는 문자열로 자동형변환(promotion)//형변환 후 문자열 더하기
		System.out.println(ss2+""+2000+25);
		System.out.println(ss2+""+(2000+25));
		
		String ss3 = "5"+6;
		System.out.println("ss3:"+ss3);
		
	    System.out.println("5"+6); //문자열더하기
	    System.out.println(5+6); //정수연산
		System.out.println(Integer.toString(5)+6); //Integer를 String으로 변환
		System.out.println(Integer.parseInt("5")+6); //Integer를 int로 parse(해석)
		
		System.out.println("누적");
		int no = 1;
		no = no+1;
		System.out.println("no:"+no);
		no+=1; // no*=x (기존no의 값에 x의 값을 곱함)
		no++; // 증감연산자 (후위) no+1 // 증강연산자는 독립적으로 사용(다른 연산기호 사용 x)
		++no; // 증감연산자 (전위) +1+no
		
		System.out.println("no:"+no);
		
		System.out.println();
		
		int imsi = 5;
		int result = ++imsi+1; //imsi를 연산 후에 전체 연산
		System.out.println("result:"+result);
		System.out.println("imsi:"+imsi);
	
		System.out.println();
		
		int imsi2 = 5;
		int result2 = imsi2++ +1;
		System.out.println("result2:"+result2);
		System.out.println("imsi2:"+imsi2);
		
		System.out.println();
		
		System.out.println("부호");
		int imsi3 = 7;
		System.out.println("imsi3:"+imsi3);
		System.out.println("imsi3:"+ -imsi3);
		System.out.println("imsi3:"+ (-1* imsi3)); // -1* , -를 변수명앞에 기재 시 부호역전
		int imsi4 = -1*imsi3;
		System.out.println("imsi4:"+imsi4);
		
		
	    System.out.println();
		
		System.out.println("산술연산자" + (char)13 + "및 기타 연습 끝");
	
		
		
		
	
	}
}