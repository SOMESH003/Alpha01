package DivideAndConquer;

public class MajorityElement_MooreVotingAlgorithm {
	public static int majorityElement(int arr[]) {
		int count=0;
		int element = 0;
		
		for(int num : arr) {
			if(count == 0) {
				element = num;
			}
			
			if(element == num) {
				count++;
			}
			else {
				count--;
			}
		}
		return element;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,2,1,1,1,2,2};
		System.out.println("Majority Element : " + majorityElement(arr));
	}

}
