package BinarySearchTree;

public class Closest_Element_in_BST {
	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
		}
	}
	public static int min_diff, min_diff_key;
	
	public static void closestNodeUtil(Node root, int key) {
		if(root == null) {
			return;
		}
		
		if(root.data == key) {
			min_diff = Math.abs(root.data - key);
			min_diff_key = key;
			return;
		}
		
		if(min_diff > Math.abs(root.data - key)) {
			min_diff = Math.abs(root.data - key);
			min_diff_key = root.data;
		}
		
		if(key < root.data) {
			closestNodeUtil(root.left, key);
		}
		else {
			closestNodeUtil(root.right, key);
		}
	}
	
	public static int closestNode(Node root, int key) {
		min_diff = Integer.MAX_VALUE;
		min_diff_key = -1;
		closestNodeUtil(root, key);
		return min_diff_key;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(5);
	    root.left = new Node(3);
	    root.right = new Node(9);
	    root.left.left = new Node(1);
	    root.left.right = new Node(2);
	    root.right.left = new Node(8);
	    root.right.right = new Node(12);
	    
	    System.out.println(closestNode(root, 13) + " " +  min_diff);
	}

}
