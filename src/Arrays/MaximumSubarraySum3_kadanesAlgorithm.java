package Arrays;

public class MaximumSubarraySum3_kadanesAlgorithm {
	public static void kadanes(int numbers[]) {
		int ms = Integer.MIN_VALUE;
		int cs = 0;
		
		for(int i=0; i<numbers.length;i++) {
			cs = cs+numbers[i];
			if(cs<0) {
				cs=0;
			}
			if(cs>ms) {
				ms = cs;
			}
		}
		System.out.println("Maximum subarray sum : " + ms);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {-2,-3,4,-1,-2,1,5,-3};
		kadanes(numbers);
	}

}
