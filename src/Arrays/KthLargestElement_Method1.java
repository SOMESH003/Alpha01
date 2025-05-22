package Arrays;
import java.util.*;

public class KthLargestElement_Method1 {
	public static int kthLargestElement(int arr[], int k) {
		Arrays.sort(arr);
		
//		int n = arr.length-1;
//		int index = n-k+1;
//		return arr[index];
		int largest = 0;
		int count=0;
		for(int i=arr.length-1; i>=0; i--) {
			count++;
			if(count == k) {
				largest = arr[i];
				break;
			}
		}
		return largest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("Kth largest : " + kthLargestElement(arr, 3));
	}

}
