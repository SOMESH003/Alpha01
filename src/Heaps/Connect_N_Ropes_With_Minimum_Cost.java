package Heaps;
import java.util.*;

public class Connect_N_Ropes_With_Minimum_Cost {
	public static int minCost(int arr[]) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0; i<arr.length; i++) {
			pq.add(arr[i]);
		}
		int sum = 0;
		
		while(!pq.isEmpty()) {
			int currSum = pq.remove() + pq.remove();
			sum += currSum;
			if(pq.isEmpty()) {
				return sum;
			}
			pq.add(currSum);
			
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,3,2,6};
		System.out.println(minCost(arr));
	}

}
