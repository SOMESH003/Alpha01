package StackPackage;
import java.util.*;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,1,5,9,2,0};
		Stack<Integer> s = new Stack<>();
		int[] nextGreater = new int[arr.length];
		
		for(int i = arr.length-1; i>=0; i--) {
			while(!s.isEmpty() && arr[s.peek()] < arr[i]) {
				s.pop();
			}
			
			if(s.isEmpty()) {
				nextGreater[i] = -1;
			}
			else {
				nextGreater[i] = arr[s.peek()];
			}
			s.push(i);
		}
		
		for(int i=0; i<nextGreater.length; i++) {
			System.out.print(nextGreater[i] + " ");
		}
		System.out.println();
	}

}
