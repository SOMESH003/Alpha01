package BinarySearchTree;

public class AVL_Tree {
	static class Node{
		int data, height;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
			height = 1;
		}
	}
	
	public static Node root;
	
	
	public static int height(Node root) {
		if(root == null) {
			return 0;
		}
		
		return root.height;
	}
	
	public static int balanceFactor(Node root) {
		if(root == null) {
			return 0;
		}
		
		return height(root.left) - height(root.right);
	}
	
	//  Rotate right
	public static Node rotateRight(Node x) {
		Node y = x.left;
		Node T2 = y.right;
		
		y.right = x;
		x.left = T2;
		
		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;
		
		return y;
	}
	
	//  Rotate left;
	public static Node rotateLeft(Node y) {
		Node x = y.right;
		Node T2 = x.left;
		
		x.left = y;
		y.right = T2;
		
		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;
		
		return x;
	}
	
	public static Node insert(Node root, int key) {
		if(root == null) {
			return new Node(key);
		}
		
		if(key < root.data) {
			root.left = insert(root.left, key);
		}
		else if(key > root.data) {
			root.right = insert(root.right, key);
		}
		else {
			return root;
		}
		
		root.height = Math.max(height(root.left), height(root.right)) + 1;
		
		int bf = balanceFactor(root);
		
		// Case - LL
		if(bf > 1 && key < root.left.data) {
			return rotateRight(root);
		}
		
		// Case - RR
		if(bf < -1 && key > root.right.data) {
			return rotateLeft(root);
		}
		
		// Case - RL
		if(bf < -1 && key < root.right.data) {
			root.right = rotateRight(root.right);
			return rotateLeft(root);
		}
		
		// Case = LR
		if(bf > 1 && key > root.left.data) {
			root.left = rotateLeft(root.left);
			return rotateRight(root);
		}
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
		root = insert(root, 10);
		root = insert(root, 20);
		root = insert(root, 30);
		root = insert(root, 40);
		root = insert(root, 50);
		root = insert(root, 25);
		
		preOrder(root);
	}

}
