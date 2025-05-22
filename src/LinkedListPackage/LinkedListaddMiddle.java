package LinkedListPackage;

import LinkedListPackage.AddLastInLinkedList.Node;

public class LinkedListaddMiddle {
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
	public static int size;    	//to Track the
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		size++;
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		size++;
		if(head == null) {
			head = tail = newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;
	}
	
	public void add(int idx, int data) {
		if(idx == 0) {
			addFirst(data);
		}
		
		Node newNode = new Node(data);
		size++;
		Node temp = head;
		int i=0;
		while(i < idx-1) {
			temp = temp.next;
			i++;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
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
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListaddMiddle ll = new LinkedListaddMiddle();
		ll.addFirst(2);
		ll.addFirst(1);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.print();
		ll.add(2,9);
		System.out.println(size);   	// size of LinkedList
		ll.print();
		
	}

}
