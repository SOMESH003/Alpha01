package ArrayList;

import java.util.ArrayList;

public class PairSum1_2PointerApproach {
	public static boolean pairSum2(ArrayList<Integer> list, int target) {
		int lp = 0;
		int rp = list.size()-1;
		
		while(lp<rp) {
			if(list.get(lp) + list.get(rp) == target) {
				return true;
			}
			if(list.get(lp) + list.get(rp) < target) {
				lp++;
			}
			else {
				rp--;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		int target = 12;
		System.out.println(target + " exist as Pair sum : " + pairSum2(list,target));
	}

}
