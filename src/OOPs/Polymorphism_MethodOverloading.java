package OOPs;

public class Polymorphism_MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		System.out.println(calc.sum(5,4));
		System.out.println(calc.sum(4.5f, 1.3f));
		System.out.println(calc.sum(4, 5, 6));
	}

}

class Calculator{
	int sum(int a, int b) {
		return a+b;
	}
	
	float sum(float a, float b) {
		return a+b;
	}
	
	int sum(int a, int b, int c) {
		return a+b+c;
	}
}
