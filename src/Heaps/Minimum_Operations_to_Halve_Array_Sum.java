package Heaps;
import java.util.*;

public class Minimum_Operations_to_Halve_Array_Sum {
	public static int minOps(ArrayList<Integer> nums) {
		int sum = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0; i<nums.size(); i++) {
			sum += nums.get(i);
			pq.add(nums.get(i));
		}
		
		double temp = sum;
		int count = 0;
		while(temp > sum/2) {
			count++;
			int highest = pq.peek();
			pq.remove();
			temp -= highest;
			highest = highest/2;
			temp += highest;
			pq.add(highest);
		}
		
		return count;
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(List.of( 4, 6, 3, 9, 10, 2));
		System.out.println(minOps(arr));
	}

}
