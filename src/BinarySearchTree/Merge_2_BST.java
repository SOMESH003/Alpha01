package BinarySearchTree;
import java.util.*;
public class Merge_2_BST {
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
	
	public static void getInorder(Node root, ArrayList<Integer> arr) {
		if(root == null) {
			return;
		}
		
		getInorder(root.left, arr);
		arr.add(root.data);
		getInorder(root.right, arr);
		
	}
	
	public static Node createBST(ArrayList<Integer> arr, int st, int end) {
		if(st > end) {
			return null;
		}
		
		int mid = (st + end)/2;
		Node root = new Node(arr.get(mid));
		
		root.left = createBST(arr, st, mid-1);
		root.right = createBST(arr, mid+1, end);
		
		return root;
	}
	
	public static Node mergeBST(Node root1, Node root2) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		getInorder(root1, arr1);
		
		ArrayList<Integer> arr2 = new ArrayList<>();
		getInorder(root2, arr2);
		
		ArrayList<Integer> arr = new ArrayList<>();
		int i=0,j=0;
		while(i < arr1.size() && j < arr2.size()) {
			if(arr1.get(i) < arr2.get(j)) {
				arr.add(arr1.get(i));
				i++;
			}
			else {
				arr.add(arr2.get(j));
				j++;
			}
		}
		
		while(i < arr1.size()) {
			arr.add(arr1.get(i));
			i++;
		}
		
		while(j < arr2.size()) {
			arr.add(arr2.get(j));
			j++;
		}
		
		return createBST(arr, 0, arr.size()-1);
		 
		
	}
	
	public static void preOrder(Node root) {
		if(root == null) {
			return ;
		}
		
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root1 = new Node(2);
		root1.left = new Node(1);
		root1.right = new Node(4);
		
		Node root2 = new Node(9);
		root2.left = new Node(3);
		root2.right = new Node(12);
		
		Node root = mergeBST(root1, root2);
		preOrder(root);
	}

}
