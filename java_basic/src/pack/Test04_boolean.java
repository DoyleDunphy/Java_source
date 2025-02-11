package pack;

public class Test04_boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("관계연산자");
		
		int a = 5;
		
		System.out.println(a>3);
		System.out.println(a>=3);
		System.out.println(a==3);
		System.out.println(a!=3); //!=(서로 다름)
		
		boolean bb = a>3;
		System.out.println("bb:"+bb);
		
		System.out.println();
		
		System.out.println("논리연산자");
		System.out.println();
		
		int b = 10;
		
		System.out.println(a>3&&b<=10); // &&(논리곱 and)
		System.out.println(a>=3&&b==5);
		
		System.out.println(a>=6||b<10); // ||(논리합 or )
		System.out.println(a>=3||b<10);
		System.out.println(a>=3&&b<20||b==10);
		
		System.out.println();
		
		boolean abc = (3+4*2>a||2*(3+1)<b);
		System.out.println(abc);
		
		
		//연산자의 우선 순위 : ()>산술>관계>논리>치환
		System.out.println(3+4*2>a||2*(3+1)<b);
		
		System.out.println("\nshift연산자"); // <<,>>,>>>
		int ii=8, ij=0;
		System.out.println(ii+""+ij);
		System.out.println("ii:"+ii+" "+Integer.toBinaryString(ii)); //toBinaryString=2진수로 변경
		ij = ii<<1; // 좌측으로 1bit 이동,남는 우측은 0으로 채움
		System.out.println("ij:"+ij);
        System.out.println("ij:"+ij+" "+Integer.toBinaryString(ij));  
        ij = ii>>2; // 우측으로 2bit 이동,남는 좌측은 부호와 같은 값으로 채움 (양수는 0,음수는 1)
		System.out.println("ij:"+ij);
	    System.out.println("ij:"+ij+" "+Integer.toBinaryString(ij));
	    
	    ij = ii>>>2; //우측으로 2bit 이동,남는 좌측은 0으로 채움
        System.out.println("ij:"+ij+" "+Integer.toBinaryString(ij));
        
        System.out.println("삼항연산자");
        int s = 6;
        int result = (s<=5)?100:20+30; //(조건)?참일때처리문 :거짓일때처리문
        System.out.println("result:"+result);
        
        System.out.println();
        
        int result2 = (s<=6)?100:20+30;
        System.out.println("result2:"+result2);
        
        System.out.println();
        int x,y,z;
        x=y=z=5;
        System.out.println(x+" "+y+" "+z);
        
        
        
	
	}

}
