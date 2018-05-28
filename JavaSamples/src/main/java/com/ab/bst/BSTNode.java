package com.ab.bst;

public class BSTNode<E> {
	
	private E e;
	private BSTNode<E> right;
	private BSTNode<E> left;

	public BSTNode(E e) {

		this.e = e;
		
	}

	/**
	 * @return the e
	 */
	public E getE() {
		return e;
	}

	/**
	 * @param e the e to set
	 */
	public void setE(E e) {
		this.e = e;
	}

	/**
	 * @return the right
	 */
	public BSTNode<E> getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(BSTNode<E> right) {
		this.right = right;
	}

	/**
	 * @return the left
	 */
	public BSTNode<E> getLeft() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(BSTNode<E> left) {
		this.left = left;
	}
	
}
