package Functions;

public class swap2 {
	public static void swap(int a, int b) {
		int temp = a;
		a=b;
		b=temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;
		System.out.println("actual value : ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		swap(a,b);
		System.out.println("after swap : ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
