package Recursion;

public class FindFirstOccuranceInArray {
	public static int firstOccurance(int arr[], int i,int key) {
		if(i==arr.length) {
			return -1;
		}
		if(arr[i] == key) {
			return i;
		}
		return firstOccurance(arr, i+1, key);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,3,6,9,15,10,2,5,3};
		System.out.println(firstOccurance(arr,0,19));
	}

}
