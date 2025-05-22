package ArrayList;
import java.util.*;

public class ReverseOfArrayList {
	public static void reverse(ArrayList<Integer> list) {
		System.out.print("Reversed ArrayList : [");
		for(int i=list.size()-1; i>=0; i--) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println("]");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<8; i++) {
			list.add(i);
		}
		System.out.println("Original ArrayList : " + list.toString());
		reverse(list);
	}

}
