package BinaryTrees;



public class Binary_Tree_is_univalued_or_not_optimized_youtube {
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
	
	public static boolean isUnivalTree(Node root) {
		boolean leftUnivalued = root.left == null || root.left.data == root.data && isUnivalTree(root.left);
		boolean rightUnivalued = root.right == null || root.right.data == root.data && isUnivalTree(root.right);
		
		return leftUnivalued && rightUnivalued;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(2);
		root.left = new Node(2);
		root.right = new Node(2);
		root.left.left = new Node(2);
		root.left.right = new Node(2);
		
		if(isUnivalTree(root)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
