package LinkedListPackage;

public class LinkedList {
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
	
	public void addfirst(int data) {
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
			System.out.println("LL is empty");
			return;
		}
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public Node mergeSort(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		Node mid = getMid(head);
		
		Node rightHead = mid.next;
		mid.next = null;
		
		Node newLeft = mergeSort(head);
		Node newRight = mergeSort(rightHead);
		
		return merge(newLeft, newRight);
	}
	
	public Node getMid(Node head) {
		Node slow = head;
		Node fast = head.next;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	private Node merge(Node head1, Node head2) {
		Node mergedLL = new Node(-1);
		Node temp = mergedLL;
		
		while(head1 != null && head2 != null) {
			if(head1.data <= head2.data) {
				temp.next = head1;
				head1 = head1.next;
				temp = temp.next;
			}
			else {
				temp.next = head2;
				head2 = head2.next;
				temp = temp.next;
			}
		}
		while(head1 != null) {
			temp.next = head1;
			head1 = head1.next;
			temp = temp.next;
		}
		while(head2 != null) {
			temp.next = head2;
			head2 = head2.next;
			temp = temp.next;
		}
		
		return mergedLL.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addfirst(1);
		ll.addfirst(2);
		ll.addfirst(3);
		ll.addfirst(4);
		ll.addfirst(5);
		ll.print();
		
		ll.head = ll.mergeSort(head);
		ll.print();
	}

}
