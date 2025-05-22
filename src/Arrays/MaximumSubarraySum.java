package Arrays;
import java.util.*;

public class MaximumSubarraySum {
	public static void maximumSubarraySum(int numbers[]) {
		int maxSum = Integer.MIN_VALUE;
		for(int i=0; i<numbers.length; i++) {
			for(int j=i; j<numbers.length; j++) {
				int sum = 0;
				for(int k = i; k<=j; k++) {
					sum += numbers[k];
				}
				System.out.println("Subarray Sum : " + sum);
				if(sum>maxSum) {
					maxSum = sum;
				}
			}
		}
		System.out.println("Maximum sum of Sub Array : " + maxSum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,-2,6,-1,3};
		
		maximumSubarraySum(numbers);
	}

}
