package Hashing;
import java.util.*;

public class Hashmap_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("India", 100);
		hm.put("China", 150);
		hm.put("Nepal", 10);
		
		System.out.println(hm);
		
		//Get
		System.out.println("---------get--------------");
		int ind_popul = hm.get("India");
		System.out.println(ind_popul);
		System.out.println(hm.get("japan"));
		
		//containskey
		System.out.println("-------contains----------");
		System.out.println("india - " + hm.containsKey("India"));
		System.out.println("indonesia - " + hm.containsKey("Indonesia"));
		
		//remove
		System.out.println("----------remove-----------");
		System.out.println("India : " + hm.remove("India"));
		System.out.println(hm);
		System.out.println("Japan : " + hm.remove("Japan"));
		
		System.out.println("-----------size------------");
		System.out.println("size : " + hm.size());
		
		System.out.println("------------empty-------------");
		System.out.println(hm.isEmpty());
		
		System.out.println("---------------clear-----------");
		hm.clear();
		System.out.println(hm.isEmpty());
		
		
				
		
	}

}
