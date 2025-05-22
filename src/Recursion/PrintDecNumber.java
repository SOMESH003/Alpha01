package Recursion;

public class PrintDecNumber {
	public static void printDec(int n) {
		if(n==1) {
			System.out.print(n);
			return;
		}
		System.out.print(n + " ");
		printDec(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		printDec(n);
	}

}
