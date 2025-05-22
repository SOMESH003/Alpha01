package Conditional_Statement;
import java.util.*;
public class leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year : ");
		int year = sc.nextInt();
		
		boolean a = (year%4 == 0);
		boolean b = (year%100 != 0);
		boolean c = (year%100 == 0) && (year%400 == 0);
		
		if(a && (b ||c)) {
			System.out.println(year + " is Leap Year.");
		}
		else {
			System.out.println(year + " is not Leap Year.");
		}
	}

}
