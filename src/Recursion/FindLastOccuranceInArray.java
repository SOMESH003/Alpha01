package Recursion;

public class FindLastOccuranceInArray {
	public static int lastOccurance(int arr[], int key, int i) {
		
		//searching from last
//		if(i<0) {
//			return -1;
//		}
//		if(arr[i] == key) {
//			return i;
//		}
//		return lastOccurance(arr,key,i-1);
		if(i==arr.length) {
			return -1;
		}
		int result = lastOccurance(arr, key, i+1);
		if(result == -1 && arr[i] == key) {
			return i;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,6,9,5,10,2,8,3};
		System.out.println(lastOccurance(arr,5,0));
	}

}
