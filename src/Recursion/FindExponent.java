package Recursion;

public class FindExponent {
	public static int xPowerN(int x, int n) {
		if(n == 1) {
			return x;
		}
		int product = x * xPowerN(x, n-1);
		return product;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int n = 5;
		System.out.println(xPowerN(x, n));
	}

}
