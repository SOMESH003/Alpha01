package GreedyAlgorithm;
import java.util.*;

public class Lexicographically_smallest_string_leetcode {
	public static char[] smallestString(int n, int k) {
		char[] res = new char[n];
		Arrays.fill(res, 'a');
		k -= n;
		while(k>0) {
			res[--n] += Math.min(25, k);
			k-= Math.min(25, k);
		}
		
		return res;
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int k = 73;
		char[] ans = smallestString(n, k);
		System.out.println(new String(ans));
		
		

	}

}
