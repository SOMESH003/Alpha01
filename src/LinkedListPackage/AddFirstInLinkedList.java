package LinkedListPackage;
import java.util.*;
public class AddFirstInLinkedList {
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null; 
		}
	}
	
	public static Node head;
	public static Node tail;
	
	public static void addFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	public static void main(String[] args) {
		AddFirstInLinkedList ll = new AddFirstInLinkedList();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		System.out.println(ll);
	}
}
