package Functions;

public class swap1 {
	public static void swap(int a, int b) {
		int temp = a;
		a=b;
		b=temp;
		System.out.println("after Swap : ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;
		System.out.println("Original Number :");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		swap(a,b);

	}

}
