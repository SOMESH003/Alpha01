package BitManipulation;

public class SwapTwoNumberWith2Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 4;
		System.out.println("Before Swap : a = " + a + " & b = " + b);
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println("After Swap : a = " + a + " & b = " + b);
	}

}
