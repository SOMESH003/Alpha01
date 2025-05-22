package BinaryTrees;

public class Binary_Tree_is_univalued_or_not {
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public static boolean checkUnivalued(Node root) {
		if(root == null) {
			return true;
		}
		
		if(root.left != null && root.left.data != root.data) {
			return false;
		}
		if(root.right != null && root.right.data != root.data) {
			return false;
		}
		
		return checkUnivalued(root.left) && checkUnivalued(root.right);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(2);
		root.left = new Node(2);
		root.right = new Node(2);
		root.left.left = new Node(2);
		root.left.right = new Node(2);
		
		if(checkUnivalued(root)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
