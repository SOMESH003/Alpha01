package ArrayList;
import java.util.*;

public class basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list.toString());
		
		list.add(2, 0);
		System.out.println(list.toString());
		
		System.out.println("get : " + list.get(3));
		list.remove(2);
		System.out.println(list.toString());
		
		list.set(2, 0);
		System.out.println(list.toString());
		
		System.out.println("cotains : " + list.contains(0));
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

}
