package LinkedListPackage;

public class LinkedList1 {
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static Node head;
	
	static void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		
	}
	
	
	public static void swapNodes(int x, int y) {
		if(x == y) {
			return;
		}
		
		Node currX = head, prevX = null;
		while(currX != null && currX.data != x) {
			prevX = currX;
			currX = currX.next;
		}
		
		Node currY = head, prevY = null;
		while(currY != null && currY.data != y) {
			prevY = currY;
			currY = currY.next;
		}
		
		if(currX == null || currY == null) {
			return;
		}
		
		if(prevX != null) {
			prevX.next = currY;
		}else {
			head = currY;
		}
		
		if(prevY != null) {
			prevY.next = currX;
		}
		else {
			head = currX;
		}
		
		Node temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;
	}
	
	public void printList()
    {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
        System.out.println();
    }
	
	public static void segregateOddEven() {
		Node evenStart = null;
		Node evenEnd = null;
		Node oddStart = null;
		Node oddEnd = null;
		Node currentNode = head;
		
		while(currentNode != null) {
			if(currentNode.data % 2 == 0) {
				if(evenStart == null) {
					evenStart = currentNode;
					evenEnd = evenStart;
				}
				else {
					evenEnd.next = currentNode;
					evenEnd = evenEnd.next;
				}
			}else {
				if(oddStart == null) {
					oddStart = currentNode;
					oddEnd = oddStart;
				}
				else {
					oddEnd.next = currentNode;
					oddEnd = oddEnd.next;
				}
			}
			currentNode = currentNode.next;
		}
		
		if(evenStart == null || oddStart == null) {
			return;
		}
		
		evenEnd.next = oddStart;
		oddEnd.next = null;
		head = evenStart;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList1 llist = new LinkedList1();
		  
        // The constructed linked list is:
        // 1->2->3->4->5->6->7
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
  
        System.out.println("Linked List Before Swapping :-");
        llist.printList();
  
        llist.swapNodes(2, 6);
  
        System.out.println("Linked List After Swapping :-");
        llist.printList();

	}

}
