package Arrays;
import java.util.*;

public class SubarrayOfArray {
	public static void printSubarray(int numbers[]) {
		int ts = 0;
		int minSum = Integer.MAX_VALUE;
		int maxSum = Integer.MIN_VALUE;
		for(int i=0; i<numbers.length;i++) {
			for(int j=i; j<numbers.length;j++) {
				int sum = 0;
				for(int k=i; k<=j; k++) {
					sum += numbers[k];
					System.out.print(numbers[k]+" ");
				}
				if(sum < minSum) {
					minSum = sum;
				}
				if(sum > maxSum) {
					maxSum = sum;
				}
				System.out.print("   --> " + sum);
				ts++;
				System.out.println();
			}
			System.out.println();
			
		}
		
		System.out.println("Total subarray : " + ts);
		System.out.println("Minimum Sum of Subarray : " + minSum);
		System.out.println("Maximum sum of Subarray : " + maxSum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2,4,6,8,10};
		printSubarray(numbers);
	}

}
