package pack4;

public class Ex19_Main {

	public static void main(String[] args) {
		Ex19_Cow cow = new Ex19_Cow();
		System.out.println(cow.name() + "는 " + cow.action() + "에 " + cow.eat()+"을 먹음");
		cow.print();
		
		System.out.println();
		
		Ex19_Lion lion = new Ex19_Lion();
		System.out.println(lion.name() + "는 " + lion.action() + "에 " + lion.eat()+"를 먹음");
		lion.eatOther();
		lion.print();

			System.out.println();
		Ex19_Animal animal;
		animal = cow;
		System.out.println(animal.name() + "는 " + animal.action() + "에 " + animal.eat()+"을 먹음");
		
		animal = lion;
		System.out.println(animal.name() + "는 " + animal.action() + "에 " + animal.eat()+"를 먹음");
		
		System.out.println(cow instanceof Ex19_Cow);
		if(cow instanceof Ex19_Cow)
			System.out.println("맞아");
		else
			System.out.println("아니야");
		
		System.out.println();

		System.out.println(cow instanceof Ex19_Animal);
		System.out.println(lion instanceof Ex19_Animal);
		
		System.out.println("\n메소드를 호출하며 매개변수에 주소치환");
		Ex19_AnimalFind animalFind = new Ex19_AnimalFind();
		animalFind.find(cow); // animal = cow; 와 같은 의미 ( 주소를 치환한다는 점에서 )
		System.out.println();
		animalFind.find(lion); // animal = lion;
	}
}
