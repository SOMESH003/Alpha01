package Recursion;

public class Factorial {
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int fn = n * fact(n-1);
		return fn;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println("Factorial of " + n + " : " + fact(n));
	}

}
