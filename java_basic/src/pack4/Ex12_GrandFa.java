package pack4;

public class Ex12_GrandFa {
	private int nai = 70;
	public String gabo = "상감청자";
	protected String gahun = "차카게 살자"; // protected 라고 쓰여지면 부모클래스일 확률이 높다
	
	Ex12_GrandFa(){
		System.out.println("할아버지 생성자");
	}
	
	Ex12_GrandFa(int nai){
		this(); // 생성자 오버로딩 , 우선 작성 
		this.nai = nai;
	}
	
	public void say() {
		System.out.println("할아버지 말씀 : 자바에 집중해라");
	}
	
	public void eat() {
		System.out.println("밥은 맛있게 먹어라");
	}

	public int getNai() {
		return nai;
	}
}
