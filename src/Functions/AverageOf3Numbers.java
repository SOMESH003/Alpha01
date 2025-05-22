package Functions;
import java.util.*;

public class AverageOf3Numbers {
	
	public static double averageOfNumbers(int a, int b, int c) {
		double average = (a+b+c)/3;
		return average;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double average = averageOfNumbers(a, b, c);
		System.out.println("Average of 3 numbers : " + average);
	}

}
