package pack4;

public class Ex24_FlyerBird implements Ex24_Flyer{
	
	@Override
	public void fly() {
		System.out.println("날개를 저으며 멀리 날아가는 새 한마리");
	}@Override
	public boolean isAnimal() {
		return true;
	}
}
