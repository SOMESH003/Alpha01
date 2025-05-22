package BinarySearchTree;

public class kth_smallest_element_in_BST {
	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
		}
	}
	
	public static int count = 0;
	
	public static Node kthSmallest(Node root, int k) {
		if(root == null) {
			return null;
		}
		
		Node left = kthSmallest(root.left, k);
		
		if(left != null) {
			return left;
		}
		count++;
		
		if(count == k) {
			return root;
		}
		return kthSmallest(root.right, k);
	}
	
	public static Node insert(Node root, int val) {
		if(root == null) {
			root =  new Node(val);
			return root;
		}
		
		if(val < root.data) {
			root.left = insert(root.left, val);
		}
		else if(val > root.data) {
			root.right = insert(root.right, val);
		}
		
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = null;
		int keys[] = { 5,3,6,2,4,1 };
		for (int x : keys)
			root = insert(root, x);
		int k = 3;
		
		System.out.println(kthSmallest(root, k).data);
	}

}
