package pack4;

public class Ex16_Dog {
	private String name = "개";

	public Ex16_Dog() {
	}
	
	public Ex16_Dog(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String callName() {
		return "종류 :" + name + "과";
	}
	
	public void print() {
		System.out.println(name + "과 동물들은 지구 상에 산다");
	}
}
