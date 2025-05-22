package ArrayList;
import java.util.*;

public class SwapInArraylist {
	public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
		int temp = list.get(idx1);
		list.set(idx1, list.get(idx2));
		list.set(idx2, temp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(5);
		list.add(9);
		list.add(3);
		list.add(6);
		int idx1=1, idx2=3;
		System.out.println("Original ArrayList : " + list);
		swap(list, idx1, idx2);
		System.out.println("Swapped ArrayList : " +  list);
	}

}
