package Recursion;

public class SumOfNnumbers {
	public static int sumOfNumbers(int n) {
		if(n==0) {
			return 0;
		}
		int sum = n + sumOfNumbers(n-1);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println("Sum of " + n + " natural numbers : " + sumOfNumbers(n));
	}

}
