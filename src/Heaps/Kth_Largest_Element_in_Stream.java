package Heaps;
import java.util.*;

public class Kth_Largest_Element_in_Stream {
	static PriorityQueue<Integer> min;
	static int k;
	static List<Integer> kthLargest(int[] arr){
		List<Integer> list = new ArrayList<>();
		
		for(int val : arr) {
			if(list.size() < k) {
				min.add(val);
			}
			else {
				if(val > min.peek()) {
					min.poll();
					min.add(val);
				}
			}
			
			if(min.size() >= k) {
				list.add(min.peek());
			}
			else {
				list.add(-1);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		min = new PriorityQueue<>();
		k=3;
		int[] arr = {4,5,6,1,2,7};
		
		List<Integer> res = kthLargest(arr);
		
		for(int val : res) {
			System.out.print(val + " ");
		}
	}

}
