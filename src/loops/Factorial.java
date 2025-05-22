package loops;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int factorial=1;
		while(number > 0) {
			for(int i=1; i<=number; i++) {
				factorial = factorial*i;
			}
			break;
		}
		System.out.println(factorial);
	}

}
