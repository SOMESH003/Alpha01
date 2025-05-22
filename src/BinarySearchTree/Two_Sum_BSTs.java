package BinarySearchTree;

public class Two_Sum_BSTs {
	static Node root1;
	static Node root2;
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
	
	public static int pairCount = 0;
	public static void traverseTree(Node root1, Node root2, int sum) {
		if(root1 == null || root2 == null) {
			return;
		}
		
		traverseTree(root1.left, root2, sum);
		traverseTree(root1.right, root2, sum);
		int diff = sum - root1.data;
		findPair(root2, diff);
	}
	
	public static void findPair(Node root2, int diff) {
		if(root2 == null) {
			return;
		}
		
		if(diff > root2.data) {
			findPair(root2.right, diff);
		}
		else {
			findPair(root2.left, diff);
		}
		if(root2.data == diff) {
			pairCount++;
		}
	}
	
	public static int countPair(Node root1, Node root2, int sum) {
		traverseTree(root1, root2, sum);
		return pairCount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		root1 = new Node(5);
		root1.left = new Node(3);
		root1.right = new Node(7);
		root1.left.left = new Node(2);
		root1.left.right = new Node(4);
		root1.right.left = new Node(6);
		root1.right.right = new Node(8);
		
		root2 = new Node(10);
		root2.left = new Node(6);
		root2.right = new Node(15);
		root2.left.left = new Node(3);
		root2.left.right = new Node(8);
		root2.right.left = new Node(11);
		root2.right.right = new Node(18);
		
		int sum = 16;
		System.out.println("Total Pairs : " + countPair(root1, root2, sum));
		
	}

}
