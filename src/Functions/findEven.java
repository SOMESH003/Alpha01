package Functions;
import java.util.*;
public class findEven {
	public static boolean isPrime(int n) {
		if(n%2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		
		if(isPrime(n)) {
			System.out.println(n + " is Prime");
		}
		else {
			System.out.println(n + " is not Prime");
		}

	}

}
