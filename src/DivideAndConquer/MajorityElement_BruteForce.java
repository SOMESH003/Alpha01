package DivideAndConquer;

public class MajorityElement_BruteForce {
	public static int majorityElement(int arr[]) {
		int majorityElement = arr.length/2;
		
		for(int i=0; i<arr.length;i++) {
			int count=0; 
			for(int j=0; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			
			if(count > majorityElement) {
				return arr[i];
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,2,1,1,1,1,1,2,2};
		System.out.println("Majority element : " + majorityElement(arr));
	}

}
