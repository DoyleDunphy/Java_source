package pack4;

public class Ex19_Lion extends Ex19_Animal{
	@Override
	public String action() {
		return "밤";
	}
	
	@Override
	public String eat() {
		return "고기";
	}
	
	@Override
	public String name() {
		return "사자";
	}
	
	public void eatOther() { // Lion 의 고유 메소드
		System.out.println("가끔은 소세지도 먹음");
	}
	
	

}
