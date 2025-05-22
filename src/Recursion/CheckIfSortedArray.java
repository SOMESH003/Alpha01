package Recursion;

public class CheckIfSortedArray {
	public static boolean isSorted(int arr[], int i) {
		if(i==arr.length-1) {
			return true;
		}
		if(arr[i] > arr[i+1]) {
			return false;
		}
		return isSorted(arr,i+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,5,4,5};
		System.out.println(isSorted(arr, 0));
//		if(isSorted(arr, 0)) {
//			System.out.println("Array is Sorted");
//		}
//		else {
//			System.out.println("Array is not sorted");
//		}
	}

}
