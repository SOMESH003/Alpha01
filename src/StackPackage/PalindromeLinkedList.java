package StackPackage;

import java.util.*;

public class PalindromeLinkedList {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public static Node head;
	
	public static boolean checkPalindrome(Node head) {
		Node temp = head;
		Stack<Integer> s = new Stack<>();
		
		while(temp != null) {
			s.push(temp.data);
			temp = temp.next;
		}
		
		boolean isPalindrome = false;
		while(head != null) {
			if(s.pop() == head.data) {
				isPalindrome = true;
			}
			else {
				isPalindrome = false;
				break;
			}
			head = head.next;
		}
		
		return isPalindrome;
	}
	
	public static void main(String[] args) {
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(2);
		Node five = new Node(1);
		
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		
		if(checkPalindrome(one)) {
			System.out.println("Yes! it is a Palindrome");
		}
		else {
			System.out.println("No! it is not a palindrome");
		}
	}

}
