package Arrays;
import java.util.*;

public class MaximumSubarraySum3_kadanesAlgorithm2 {
	public static void kadanes(int numbers[]) {
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		int maxSi = -1;
		int maxEi = -1;
		int si=0;
		
		for(int i=si; i<numbers.length; i++) {
			sum = sum + numbers[i];
			if(sum > maxSum) {
				maxSum = sum;
				maxSi = si;
				maxEi = i;
			}
			if(sum < 0) {
				sum = 0;
				si = i+1;
			}
		}
		for(int i=maxSi; i<=maxEi; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println("\nMaximum Subarray Sum : "+maxSum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {-2,-3,4,-1,-2,1,5,-3};
		kadanes(numbers);
	}

}
