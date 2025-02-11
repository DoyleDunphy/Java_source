package pack4;

public class Ex16_WolfDog extends Ex16_Dog {
	private String where = "동물원";
	
	public Ex16_WolfDog(String name) {
		super(name);
	}
	
	public void show() {
		System.out.println("Wolf dog 어디 사니?" + where + "에 산다");
	}
	
	@Override
	public void print() {
		System.out.println(getName()+"는(은)"+where+" 에서 사람들 시선을 느끼며 산다");
	}
}
