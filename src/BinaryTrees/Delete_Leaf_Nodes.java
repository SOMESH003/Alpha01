package BinaryTrees;

public class Delete_Leaf_Nodes {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public static Node deleteLeaf(Node root, int x) {
		if(root == null) {
			return null;
		}
		
		root.left = deleteLeaf(root.left,x);
		root.right = deleteLeaf(root.right,x);
		
		if(root.data == x && root.left == null && root.right == null) {
			return null;
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(3);
		root.right = new Node(3);
		root.left.left = new Node(3);
		root.left.right = new Node(2);
		
		int x = 3;
		inOrder(root);
		
		deleteLeaf(root, x);
		System.out.println();
		
		inOrder(root);
		
	}

}
