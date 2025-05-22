package Hashing;
import java.util.*;
public class HashSet_Iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> cities = new HashSet<>();
		cities.add("Delhi");
		cities.add("Gurugram");
		cities.add("Noida");
		cities.add("Kathmandu");
		System.out.println("cities : "+cities);
		
		/* ->  Using Iterator
		Iterator it = cities.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		
		// -> Using Enhanced for Loop
		for(String city : cities) {
			System.out.println("city : "+ city);
		}
	}

}
