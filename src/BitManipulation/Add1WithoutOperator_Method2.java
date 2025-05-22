package BitManipulation;

public class Add1WithoutOperator_Method2 {
	public static int add1ToNumber(int x) {
		return (-(~x));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Next Number : " + add1ToNumber(13));	
	}

}
