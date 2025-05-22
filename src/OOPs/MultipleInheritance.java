package OOPs;

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beer b1 = new Beer();
		b1.eatGrass();
		b1.eatMeat();
	}

}

interface Herbivour{
	void eatGrass();
}

interface Carnivour{
	void eatMeat();
}

class Beer implements Herbivour,Carnivour{
	public void eatGrass(){
		System.out.println("Beer eats Green grass");
	}
	public void eatMeat() {
		System.out.println("Beer eats Meat");
	}
}