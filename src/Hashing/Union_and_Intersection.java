package Hashing;
import java.util.*;

public class Union_and_Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {7,3,9};
		int[] arr2 = {6,3,9,2,9,4};
		HashSet<Integer> set = new HashSet<>();
		
		//  Union
		for(int i=0; i<arr1.length; i++) {
			set.add(arr1[i]);
		}
		for(int i=0; i<arr2.length; i++) {
			set.add(arr2[i]);
		}
		System.out.print("Union : " + set.size() + " -> ");
		System.out.print("[ ");
		for(int val : set) {
			System.out.print(val + " ");
		}
		System.out.println("]");
		
		//  Intersection
		set.clear();
		HashSet<Integer> res = new HashSet<>();
		for(int i=0; i<arr1.length; i++) {
			set.add(arr1[i]);
		}
		int count = 0;
		for(int i=0; i<arr2.length; i++) {
			if(set.contains(arr2[i])) {
				res.add(arr2[i]);
				count++;
				set.remove(arr2[i]);
			}
		}
		System.out.print("Intersection : " + count + " -> ");
		System.out.print("[ ");
		for(int val : res) {
			System.out.print(val + " ");
		}
		System.out.println("]");
	}

}
