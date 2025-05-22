package QueuePackage;
import java.util.*;

public class Maximum_of_all_subarrays_of_size_k_Sliding_Window {
	static void printMax(int[] arr, int N, int k) {
		Deque<Integer> Qi = new LinkedList<>();
		int i;
		for(i=0; i<k; i++) {
			while(!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
				Qi.removeLast();
			}
			Qi.addLast(i);
		}
		
		for(; i<N; i++) {
			System.out.print(arr[Qi.peek()] + " ");
			
			
			while(!Qi.isEmpty() && Qi.peek() <= i-k) {
				Qi.removeFirst();
			}
			
			while(!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
				Qi.removeLast();
			}
			Qi.addLast(i);
		}
		System.out.print(arr[Qi.peek()] + " ");
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,1,3,5,1,2,3,2,1,1,5};
		int k = 3;
		System.out.print("Max of All Subarray : ");
		printMax(arr, arr.length, k);
	}

}
