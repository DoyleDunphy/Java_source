package pack;

public class Test08_for {

	public static void main(String[] args)
	{
		
		System.out.println("continue, break");
		for(int i=1;i<=10;i++) {
			if(i==3||i==5)continue;//continue - 자신과 대응되는 for 문으로 무조건 이동
			System.out.println(i);
			if(i==7)break;
		}
		System.out.println("------");

		//무한반복문
		int k=0;
		for(;;) {
			k++;
			System.out.println("k"); {
			if(k==5)break;
			}
		}
		
	}

}
