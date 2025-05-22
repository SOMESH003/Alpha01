package GreedyAlgorithm;
import java.util.*;

public class ActivitySelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] start = {1,3,0,5,8,5};
		int[] end = {2,4,6,7,9,9};
		
		int maxAct = 0;
		ArrayList<Integer> ans = new ArrayList<>();
		
		maxAct = 1; 
		ans.add(0);
		int endLast = end[0];
		
		for(int i=1; i<end.length; i++) {
			if(start[i] >= endLast) {
				maxAct++;
				ans.add(i);
				endLast = end[i];
			}
		}
		
		System.out.println("Max Activities : " + maxAct);
		for(int i=0; i<ans.size(); i++) {
			System.out.print("A" + ans.get(i) + " ");
		}
		System.out.println();
	}

}
