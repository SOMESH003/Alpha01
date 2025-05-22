package Hashing;
import java.util.*;

public class Iteration_on_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("India", 100);
		hm.put("China", 150);
		hm.put("US", 50);
		hm.put("Nepal", 5);
		hm.put("Japan", 6);
		
//		Set<String> keys = hm.keySet();
//		System.out.println(keys);
//		
//		for(String k: keys) {
//			System.out.println("Keys = " + k + ", Value = " + hm.get(k));
//		}
		
		Set<Map.Entry<String,Integer>> keyValue = hm.entrySet();
		for(Map.Entry<String,Integer> val : keyValue) {
			System.out.println(val);
		}
	}

}
