package OOPs;

public class Polymorphism_MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deer d1= new Deer();
		d1.eat();
	}

}

class Animal{
	void eat() {
		System.out.println("Eats Anything");
	}
}

class Deer extends Animal{
	void eat() {
		System.out.println("Eats Grass");
	}
}
