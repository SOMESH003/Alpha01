package BinarySearchTree;

import BinarySearchTree.Delete_a_Node.Node;

public class Print_In_Range {
	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public static Node insert(Node root, int val){
		if(root == null) {
			root = new Node(val);
			return root;
		}
		
		if(root.data > val) {
			root.left = insert(root.left, val);
		}
		else if(root.data < val) {
			root.right = insert(root.right, val);
		}
		return root;	
	}
	
	public static void inOrder(Node root) {
		if(root == null) {
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	public static void printInRange(Node root, int k1, int k2) {
		if(root == null) {
			return;
		}
		if(root.data >=k1 && root.data<=k2) {
			printInRange(root.left, k1, k2);
			System.out.print(root.data + " ");
			printInRange(root.right, k1, k2);
		}
		
		else if(root.data < k1) {
			printInRange(root.left, k1, k2);
		}
		else {
			printInRange(root.right, k1, k2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int values[] = {8,5,3,1,4,6,10,11,14};
		Node root = null;
		
		for(int i=0; i<values.length; i++) {
			root = insert(root, values[i]);
		}
		
		inOrder(root);
		System.out.println();
		
		printInRange(root, 5, 12);
	}

}
