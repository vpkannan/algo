package vig.algo.ds.tree;

/**
 * @author Vignesh
 *
 */
public class BinaryTree<T> {

	T val;
	private BinaryTree<T> left;
	private BinaryTree<T> right;

	public BinaryTree() {
		super();
	}

	public BinaryTree(T val) {
		super();
		this.val = val;
	}

	public BinaryTree(T val, BinaryTree<T> left, BinaryTree<T> right) {
		super();
		this.val = val;
		this.left = left;
		this.right = right;
	}

	public T getVal() {
		return val;
	}

	public void setVal(T val) {
		this.val = val;
	}

	public BinaryTree<T> getLeft() {
		return left;
	}

	public void setLeft(BinaryTree<T> left) {
		this.left = left;
	}

	public BinaryTree<T> getRight() {
		return right;
	}

	public void setRight(BinaryTree<T> right) {
		this.right = right;
	}

}
