package BitManipulation;

public class OddOrEven {
	public static void oddOrEven(int n) {
		int bitMask = 1;
		if((n & bitMask) == 0) {
			System.out.println(n + " is Even Number");
		}
		else {
			System.out.println(n + " is Odd Number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oddOrEven(3);
		oddOrEven(7);
		oddOrEven(10);
	}

}
