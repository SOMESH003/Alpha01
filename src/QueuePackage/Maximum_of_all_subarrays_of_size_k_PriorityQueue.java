package QueuePackage;
import java.util.*;

public class Maximum_of_all_subarrays_of_size_k_PriorityQueue {
	public static ArrayList<Integer> findKMaxElement(int arr[], int n, int k){
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		ArrayList<Integer> res = new ArrayList<>();
		
		int i=0;
		for(; i<k; i++) {
			queue.add(arr[i]);
		}
		
		res.add(queue.peek());
		
		queue.remove(arr[0]);
		
		for(; i < n; i++) {
			queue.add(arr[i]);
			res.add(queue.peek());
			queue.remove(arr[i-k+1]);
			
		}
		return res;
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,1,3,5,1,2,3,2,1,1,5};
		int k = 3;
		int n = arr.length;
		
		List<Integer> res = findKMaxElement(arr, n, k);
		
		for(int x : res) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

}
