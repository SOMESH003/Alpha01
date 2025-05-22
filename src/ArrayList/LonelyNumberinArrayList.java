package ArrayList;
import java.util.*;

public class LonelyNumberinArrayList {
	public static ArrayList<Integer> lonelyNumbers(ArrayList<Integer> list){
		Collections.sort(list);
		if(list.size() <= 1) {
			return list;
		}
		
		ArrayList<Integer> ans = new ArrayList<>();
		if(list.get(0) + 1 < list.get(1)) {
			ans.add(list.get(0));
		}
		
		for(int i=1; i<list.size()-1; i++) {
			if(list.get(i-1) + 1 < list.get(i) && list.get(i)+1 < list.get(i+1)) {
				ans.add(list.get(i));
			}
		}
		if(list.get(list.size()-2) + 1 < list.get(list.size()-1)) {
			ans.add(list.get(list.size()-1));
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(6);
		list.add(5);
		list.add(8);
		System.out.println(list);
		System.out.println(lonelyNumbers(list));
	}

}
