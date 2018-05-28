package com.ab.bst;

import com.ab.bst.BSTNode;

public class BSTOperation {
	
	private static BSTNode<Integer> root;

	public static void main(String[] args) {

		root = createRoot(8);
		
		addElement(4, root);
		addElement(12, root);
		addElement(2, root);
		addElement(6, root);
		addElement(11, root);
		//
		addElement(9, root);
		addElement(1, root);
		addElement(3, root);
		addElement(5, root);
		addElement(7, root);
		
		//addElement(9, root);
		
		addElement(14, root);
		addElement(13, root);
		addElement(15, root);
		
		traverseTreeInorder(root);
		
		addElement(10, root);
		
		traverseTreeInorder(root);
		
		//searchElement(8, root);
		
		//deleteElement(8, root);
		
		//searchElement(8, root);
		
		
		
	}
	
	//preorder
		public static void traverseTreeInorder(BSTNode<Integer> root) {
			
			if(root == null)
				return;
			
			traverseTreeInorder(root.getLeft());
			
			if(root != null) {
				System.out.println("root -- > " + root.getE());
				if(root.getLeft() != null) {
					System.out.println("root left-- > " + root.getLeft().getE());
				}else {
					System.out.println("root left-- > " + null);
				}
				if(root.getRight() != null) {
					System.out.println("root right -- > " + root.getRight().getE());
				}else {
					System.out.println("root right -- > " + null);
				}
				
				
			}
			//if(root.getLeft() != null)
			
			
			//if(root.getRight() != null)
			traverseTreeInorder(root.getRight());
			
			
			
		}
	
	//preorder
	public static void traverseTreePreorder(BSTNode<Integer> root) {
		
		if(root == null)
			return;
		
		//if(root != null)
			System.out.println(root.getE());
		
		//if(root.getLeft() != null)
		traverseTreePreorder(root.getLeft());
		
		//if(root.getRight() != null)
		traverseTreePreorder(root.getRight());
		
		
		
	}

	public static BSTNode<Integer> createRoot(int e) {
		return new BSTNode<Integer>(e);
	}

	public static void addElement(int e, BSTNode<Integer> root) {
		
		if(root == null) {
			return;
		}
		
		if(e > root.getE() && root.getRight() != null) addElement(e, root.getRight());
		
		if(e <= root.getE() && root.getLeft() != null) addElement(e, root.getLeft());
		
		BSTNode<Integer> node = new BSTNode<Integer>(e);
		
		if(e > root.getE() && root.getRight() == null)
			root.setRight(node);
		else if(root.getLeft() == null)
			root.setLeft(node);
		
	}

	public static void deleteElement(int e) {
		
		BSTNode<Integer> node = searchElement(e, root);
		
		

	}

	public static BSTNode<Integer> searchElement(int e, BSTNode<Integer> root) {

		if(root == null) {
			return root;
		}
		
		if(e == root.getE()) {
			System.out.println(e);
			return root;
		}
		
		if(e < root.getE()) {
			searchElement(e, root.getLeft());
		}else {
			searchElement(e, root.getRight());
		}
		return null;
	}
	
}
