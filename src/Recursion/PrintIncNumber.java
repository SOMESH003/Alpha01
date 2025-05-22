package Recursion;

public class PrintIncNumber {
	public static void printIncreasing(int n) {
		if(n==1) {
			System.out.print(n + " ");
			return;
		}
		printIncreasing(n-1);
		System.out.print(n + " ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		printIncreasing(n);
	}

}
