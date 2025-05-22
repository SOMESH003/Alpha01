package StackPackage;
import java.util.*;

public class ReverseString {
	public static String reverseString(String str) {
		Stack<Character> s = new Stack<>();
		int i=0;
		while(i<str.length()) {
			s.push(str.charAt(i));
			i++;
		}
		
		StringBuilder result = new StringBuilder("");
		while(!s.isEmpty()) {
			result.append(s.pop());
		}
		return result.toString(); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		System.out.println("Original String : " + str);
		
		String result = reverseString(str);
		System.out.println("Reverse String : " + result);
	}

}
