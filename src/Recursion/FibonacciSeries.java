package Recursion;

public class FibonacciSeries {
	public static int fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int fib = fib(n-1) + fib(n-2);
		return fib;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		System.out.println(n + "th Fibonacci number : " + fib(n));
	}

}
