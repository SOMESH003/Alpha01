package BinarySearchTree;

public class Mirror_BST {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	public static Node mirror(Node root) {
		if(root == null) {
			return null;
		}
		
		Node leftMirror = mirror(root.left);
		Node rightMirror = mirror(root.right);
		
		root.left = rightMirror;
		root.right = leftMirror;
		
		return root;
	}
	
	public static void preOrder(Node root) {
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(8);
		root.left = new Node(5);
		root.right = new Node(10);
		root.left.left = new Node(3);
		root.left.right = new Node(6);
		root.right.right = new Node(11);
		
		System.out.print("Original : ");
		preOrder(root);
		System.out.println();
		
		root = mirror(root);
		
		System.out.print("Mirror : ");
		preOrder(root);
	}

}
