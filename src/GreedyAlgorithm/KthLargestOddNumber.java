package GreedyAlgorithm;
import java.util.*;

public class KthLargestOddNumber {
	public static int kthOdd(int[] range, int k) {
		if(k <= 0) {
			return 0;
		}
		
		int L = range[0];
		int R = range[1];
		
		if((R & 1) > 0) {
			int count = (int)Math.ceil((R-L+1)/2);
			if(k > count) {
				return 0;
			}
			else {
				return (R - 2*k + 2);
			}
		}
		else {
			int count = (R-L+1)/2;
			if(k > count) {
				return 0;
			}
			else {
				return (R - 2*k + 1);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

// ----------------------------------------------------------------
//		Brute Force approach --> T.C. - O(n)		
//		int L = -3;
//		int R = 3;
//		int k = 1;
		
//		ArrayList<Integer> al = new ArrayList<>();
//		
//		for(int i = R; i >= L; i--) {
//			
//			if(i % 2 != 0) {
//				al.add(i);
//			}			
//		}
//		System.out.println(al.get(k-1));
// -----------------------------------------------------------------
		
		int[] p = {-10,10};
		int k = 8;
		System.out.println(k + "th Odd element : " + kthOdd(p, k));
		
	}

}
