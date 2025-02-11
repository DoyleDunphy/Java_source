package pack4;

public class Ex17__AnimalMain {
public static void main(String[] args) {
	Ex17__Animal myAnimal = new Ex17__Animal();
	Ex17__Animal myPig = new Ex17__Pig();
	Ex17__Animal myDog = new Ex17__Dog();
	
	myAnimal.animalSound();
	myPig.animalSound();
	myDog.animalSound();
	
	System.out.println("---");
	myAnimal = myPig;
	myAnimal.animalSound();
	myAnimal = myDog;
	myAnimal.animalSound();
}
}
