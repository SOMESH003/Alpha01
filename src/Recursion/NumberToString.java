package Recursion;

public class NumberToString {
	static String[] word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	
	public static void numberToString(int n) {
		if(n==0) {
			return;
		}
		int lastDigit = n%10;
		numberToString(n/10);
		System.out.print(word[lastDigit] + " ");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberToString(1230);
		System.out.println();
	}

}
