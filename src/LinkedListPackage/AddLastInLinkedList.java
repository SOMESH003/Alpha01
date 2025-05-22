package LinkedListPackage;

import java.util.*;

import Functions.printPrimeInRange;

public class AddLastInLinkedList {
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
	
	public static void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = tail = newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;
	}
	public static void addFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = tail = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	public void print() {
		if(head == null) {
			System.out.println("LinkedList is Empty");
			return;
		}
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddLastInLinkedList ll = new AddLastInLinkedList();
		ll.addFirst(2);
		ll.addFirst(1);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
//		System.out.println(ll);
		ll.print();

	}
	

}
