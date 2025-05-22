package QueuePackage;
import java.util.*;

public class Maximum_of_all_subarrays_of_size_k {
	public static void  maximumOfSubarray(int[] arr, int N, int k) {
		Queue<Integer> q = new LinkedList<>();
		int max;
		int i=0;
		while(i < arr.length-2 ) {
			max = max = Integer.MIN_VALUE;
			int j=0;
			while(j<k){
				int idx = i+j;
				if(arr[idx] > max) {
					max = arr[idx];
				}
				j++;
			}
//			System.out.println(max);
			q.add(max);
			i++;
		}
		
		while(!q.isEmpty()) {
			System.out.print(q.peek());
			q.remove();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,1,4,5,2,3,6};
		int N = arr.length;
		int k = 3;
		maximumOfSubarray(arr,N,k);
		
	}

}
