package loops;
import java.util.*;

public class do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter the number : ");
			int n = sc.nextInt();
			
			if(n%10 == 0) {
				break;
			}
			System.out.println(n);
		}while(true);
	}

}
