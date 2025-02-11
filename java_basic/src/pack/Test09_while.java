package pack;

public class Test09_while {
	public static void main(String[] args) {
		// 반복문 while : while(조건){반복처리대상}

int w=1;
	while(w<=5) {
		System.out.print("w:"+w+" ");
		w+=1; //조건이 거짓이 되는 명령문 필요
}
	System.out.println("\n탈출 후 w :"+w);
	
	System.out.println();
	
int count=0;
	while(count<10) {
		count++;  // ++count , count+=1 , count=count+1
		System.out.println("count:"+count);
		if(count==10) {
			System.out.println("count가 10이라서 반복문 종료 "+count);
		}
	  }
	
	System.out.println("----다중 while----");
	
int a=1;
while(a<=3) {
	System.out.println("a:"+a);
	int b=1;
	while(b<=4) {
		System.out.print("b="+b+" ");
		b++;
	}
	a++;
	System.out.println();
}
	System.out.println("----do while----");
int m=10;
do { //최소 1회는 반드시 수행
	System.out.println("do while의 m:"+m);
	m++;
}while(m<=5);

	System.out.println("----continue,break----");
int x=0;
while(x<=10) {
	x=x+1;
	if(x==3)continue;
	if(x==7)break;
	System.out.println("x:"+x);
}
	System.out.println("----무한루프(looping)----");
	int y=1;
while(true) {
	//System.out.println("y:"+y);
		y++;
			if(y==5)break;
			
			System.out.println("----Q1----");
} // 문: 1~10 사이의 정수 중 짝수만 출력 , 그 개수도 출력

int z=1;
int counter=0;
while(z<=10) {
	if(z%2==0) { //짝수고르기
System.out.println("z:"+z);
counter++;
	}
	z++;	
}
System.out.println(counter);

	}

}
