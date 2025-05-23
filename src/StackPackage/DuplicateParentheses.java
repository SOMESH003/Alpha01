package StackPackage;

import java.util.Stack;

public class DuplicateParentheses {
	public static boolean isDuplicate(String str) {
		Stack<Character> s = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ')') {
				int count = 0;
				while(s.peek() != '(') {
					s.pop();
					count++;
				}
				
				if(count<1) {
					return true;
				}
				else {
					s.pop();
				}
			}
			else {
				s.push(str.charAt(i));
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "((a+b))";
		String str2 = "(a-b)";
		System.out.println(isDuplicate(str1));
		System.out.println(isDuplicate(str2));

	}

}
