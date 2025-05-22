package OOPs;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish tuna = new Fish();
		tuna.swim();
		tuna.color = "orange";
		tuna.eat();
		tuna.breathe();
		System.out.println("tuna color is " + tuna.color);
	}

}

class Animals{
	String color;
	
	void eat() {
		System.out.println("eats");
	}
	void breathe() {
		System.out.println("breathes");
	}
}

//class Fish extends Animals{
//	int fins;
//	
//	void swims() {
//		System.out.println("Swims");
//	}
//}

class Mammal extends Animals{
	void walk() {
		System.out.println("walks");
	}
}

class Bird extends Animals{
	void fly() {
		System.out.println("fly");
	}
}

class Fish extends Animals{
	void swim() {
		System.out.println("swim");
	}
}

//class Dog extends Mammal{
//	String breed;
//}


