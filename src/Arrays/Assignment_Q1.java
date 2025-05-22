package Arrays;

public class Assignment_Q1 {
	public static boolean checkRepetation(int nums[]) {
				
		int n = nums.length;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(nums[i] == nums[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,1,3,4};
		if(checkRepetation(nums)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
