/**
 * 
 */
package vig.algo.ds.tree;

/**
 * @author Vignesh
 * 
 *         Binary Search Tree overrides all the properties of a BinaryTree with
 *         some customizations.
 * 
 *         General Properties of binary search tree
 * 
 *         1. Value of left node should be smaller than value of the node.
 * 
 *         2. Value of right node should be bigger than value of the node.
 *
 */
public class BinarySearchTree<T> extends BinaryTree<T> {

	public BinarySearchTree() {
		super();
	}

	public BinarySearchTree(T val) {
		super(val);
	}

}
