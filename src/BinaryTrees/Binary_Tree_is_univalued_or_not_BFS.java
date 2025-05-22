package BinaryTrees;
import java.util.*;

public class Binary_Tree_is_univalued_or_not_BFS {
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
	
	public static boolean isUnivalTree(Node root) {
		Queue<Node> q = new LinkedList<>();
		
		q.add(root);
		int val = root.data;
		
		while(!q.isEmpty()) {
			Node currNode = q.peek();
			
			if(currNode.data != val) {
				return false;
			}
			
			if(currNode.left != null) {
				q.add(currNode.left);
			}
			if(currNode.right != null) {
				q.add(currNode.right);
			}
			q.remove();
		}
		return true;
	}
	public static void main(String[] args) {
		Node root = new Node(2);
		root.left = new Node(2);
		root.right = new Node(2);
		root.left.left = new Node(1);
		root.left.right = new Node(2);
		
		if(isUnivalTree(root)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
