package pack4;

public class Ex19_AnimalFind {
	public void find(Ex19_Animal animal) {
		animal.print();
		
		if(animal instanceof Ex19_Cow) {
			System.out.println("이름은 "+ animal.name());
		}else if(animal instanceof Ex19_Lion) {
			System.out.println("이름 : "+ animal.name() + ", 뭐 먹니? "+ animal.eat());
		}else {
			System.out.println("기타");
		}
	}
}
