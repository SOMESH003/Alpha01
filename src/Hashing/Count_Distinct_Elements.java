package Hashing;

import java.util.HashSet;

public class Count_Distinct_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {4,3,2,5,6,7,3,4,2,1};
		HashSet<Integer> set = new HashSet<>();
		for(int val : num) {
			set.add(val);
		}
		System.out.println("Distinct Elements : " + set.size());
	}

}
