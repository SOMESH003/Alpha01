package BinaryTrees;
import java.util.*;

import BinaryTrees.Mirror_Of_BinaryTree.Node;

public class Mirror_Of_Binary_Tree_Level_Order_Traversal {
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
	
	public static Node mirror(Node root) {
		if(root == null) {
			return null;
		}
		
		Queue<Node> q = new LinkedList<>();
		if(root != null) {
			q.add(root);
		}
		
		while(!q.isEmpty()) {
			Node curr = q.poll();
			
			Node temp = curr.left;
			curr.left = curr.right;
			curr.right = temp;
			
			if(curr.left != null) {
				q.add(curr.left);
			}
			if(curr.right != null) {
				q.add(curr.right);
			}
		}
		return root;
	}
	
	public static void LevelOrder(Node root) {
		if(root == null) {
			return;
		}
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			Node currNode = q.remove();
			if(currNode == null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}
				else {
					q.add(null);
				}
			}
			else {
				System.out.print(currNode.data + " ");
				if(currNode.left != null) {
					q.add(currNode.left);
				}
				if(currNode.right != null) {
					q.add(currNode.right);
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		LevelOrder(root);
		System.out.println();
		mirror(root);
		LevelOrder(root);
	}

}
