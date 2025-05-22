package QueuePackage;

import java.util.PriorityQueue;

public class Connect_N_ropes_with_minimum_cost {
	static int minCost(int[] arr, int n) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0; i<n; i++) {
			pq.add(arr[i]);
		}
		
		int res = 0;
		
		while(pq.size() > 1) {
			int first = pq.poll();
			int second = pq.poll();
			
			pq.add(first + second);
			
			res += (first+second);
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr = {4,3,2,6};
		int size = arr.length;
		System.out.println("Minimum Cost : " + minCost(arr, size));
	}
}
