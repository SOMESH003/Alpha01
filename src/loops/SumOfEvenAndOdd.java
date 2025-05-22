package loops;
import java.util.*;

public class SumOfEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int number;
		int choice;
		int evenSum = 0;
		int oddSum = 0;
		
		do {
			System.out.print("Enter the number ");
			number = sc.nextInt();
			
			if(number%2 == 0) {
				evenSum += number;
			}
			else {
				oddSum += number;
			}
			
			System.out.println("Enter the Choice : 1 --> Yes || 0 --> No");
			choice = sc.nextInt();
			
		}while(choice == 1);
		
		System.out.println("Sum of Even Integer : " + evenSum);
		System.out.println("Sum of odd Integer : " + oddSum);
	}

}
