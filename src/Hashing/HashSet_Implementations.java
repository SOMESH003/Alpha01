package Hashing;
import java.util.*;

public class HashSet_Implementations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(4);
		set.add(2);
		set.add(1);
		
		System.out.println(set);
		
		if(set.contains(2)) {
			System.out.println("set contains 2");
		}
		else {
			System.out.println("set does not contains 2");
		}
		set.remove(2);
		if(set.contains(2)) {
			System.out.println("set contains 2");
		}
		else {
			System.out.println("set does not contains 2");
		}
		
		System.out.println(set.size());
		set.clear();
		System.out.println(set.size());
		System.out.println(set.isEmpty());
	}

}
