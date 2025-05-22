package Functions;
import java.util.*;

public class checkPalindrome {
	public static boolean isPalindrome(int n) {
		int temp = n;
		int reverse=0;;
		while(n>0) {
			int lastDigit = n%10;
			reverse = reverse*10 + lastDigit;
			n = n/10;
		}
		if(temp == reverse) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		if(isPalindrome(n)) {
			System.out.println(n + " is Palindrome");
		}
		else {
			System.out.println(n + " is not Palindrome");
		}

	}

}
