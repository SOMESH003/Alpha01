package GreedyAlgorithm;

public class Split_into_K_sub_arrays {
	public static int splitArray(int[] arr, int k) {
		int low = 0;
		int high = 0; 
		int n = arr.length;
		for(int i=0; i<n; i++) {
			 low = Math.max(low, arr[i]);
			 high += arr[i];
		}
		
		int mid = 0; 
		int ans = 0;
		while(low<=high) {
			mid = (low+high)/2;
			int count = isPossible(arr, mid);
			if(count <= k) {
				high = mid-1;
				ans = mid;
			}
			else {
				low = mid+1;
			}
		}
		return ans;
	}
	
	public static int isPossible(int[] arr, int mid) {
		int count = 0;
		int tempSum = 0;
		int n = arr.length;
		for(int i=0; i<n; i++) {
			if(tempSum + arr[i] <= mid) {
				tempSum += arr[i];
			}
			else {
				count++;
				tempSum = arr[i];
			}
		}
		count++;
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr = {7, 2, 5, 10, 8};
		int k = 2; 
		System.out.println("Maximum subarray sum : " + splitArray(arr, k));
	}
}
