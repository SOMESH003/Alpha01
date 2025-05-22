package Hashing;
import java.util.*;

public class Largest_Subarray_with_Sum_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {15,-2,2,-8,1,7,10,23};
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int len = 0;
		
		for(int j=0; j<arr.length; j++) {
			sum += arr[j];
			if(map.containsKey(sum)) {
				len = Math.max(len, j - map.get(sum));
			}
			else {
				map.put(sum, j);
			}
		}
		System.out.println("Largest Length of Subarray with Sum 0 => " + len);
	}

}
