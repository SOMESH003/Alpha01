package DivideAndConquer;

public class MajorityElement_DivideAndConquer {
	public static int countMajority(int arr[], int key, int lo, int hi) {
		int count=0;
		for(int i=0; i<=hi; i++) {
			if(arr[i] == key) {
				count++;
			}
		}
		return count;
	}
	public static int majorityElement(int arr[], int lo, int hi) {
		if(lo == hi) {
			return arr[lo];
		}
		
		int mid = lo + (hi-lo)/2;
		
		int left = majorityElement(arr, lo, mid);
		int right = majorityElement(arr, mid+1, hi);
		
		if(left == right) {
			return left;
		}
		
		int leftCount = countMajority(arr, left, lo, hi);
		int rightCount = countMajority(arr, right, lo, hi);
		
		return leftCount > rightCount ? left:right;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method 
		int[] arr = {2,2,1,1,1,2,2};
		System.out.println("majority element : "  + majorityElement(arr,0,arr.length-1));
	}

}
