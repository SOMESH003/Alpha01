package Recursion;

public class FindOccuranceOfKey {
	public static void findOccurance(int arr[],int idx, int key) {
		if(idx == arr.length) {
			return;
		}
		if(arr[idx] == key) {
			System.out.print(idx + " ");
		}
		findOccurance(arr, idx+1, key);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,4,5,6,2,7,2,2};
		findOccurance(arr, 0, 2);
	}

}
