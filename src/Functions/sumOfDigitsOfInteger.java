package Functions;
import java.util.*;

public class sumOfDigitsOfInteger {
	public static void sumOfDigits(int n) {
		int sum = 0;
		int number = n;
		while(n>0) {
			int digit = n%10;
			sum += digit;
			n /= 10;
		}
		System.out.println("Sum of Digits of " + number + " : " + sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int n = sc.nextInt();
		sumOfDigits(n);		
	}

}
