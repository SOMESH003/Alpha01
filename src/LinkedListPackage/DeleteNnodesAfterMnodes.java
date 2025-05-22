package LinkedListPackage;

public class DeleteNnodesAfterMnodes {
	static class Node{
		int data;
		Node next;
	}
	
	static Node push(Node head, int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
		return head;
	}
	
	static void skipMdeleteN(Node head, int M, int N) {
		Node curr = head,t;
		int count;
		while(curr != null) {
			for(count = 1; count < M && curr != null; count++) {
				curr = curr.next;
			}
			
			if(curr == null) {
				return;
			}
			
			t = curr.next;
			for(count = 1; count <= N && t != null; count++) {
				Node temp = t;
				t = t.next;
			}
			
			curr.next = t;
			curr = t;
			
		}
	}
	
	static void print(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int M = 2;
		int N = 2;
		Node head  = null;
		head = push(head,10);
		head = push(head,9);
		head = push(head,8);
		head = push(head,7);
		head = push(head,6);
		head = push(head,5);
		head = push(head,4);
		head = push(head,3);
		head = push(head,2);
		head = push(head,1);
		print(head);
		
		skipMdeleteN(head, M, N);
		
		print(head);
	}
}
