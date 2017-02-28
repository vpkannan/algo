/**
 * 
 */
package vig.algo.ds.linear;

/**
 * @author Vignesh
 *
 */
public class DoublyLinkedList {

}

/**
 * Represents a node in the doubly linked list
 * 
 * @author Vignesh
 *
 * @param <T>
 *            A generic data type for the node
 */
class DNode<T> {

	private T item;
	private DNode<T> next;
	private DNode<T> previous;

	public DNode() {
		super();
		this.next = null;
		this.previous = null;
	}

	public DNode(T item, DNode<T> next, DNode<T> previous) {
		super();
		this.item = item;
		this.next = next;
		this.previous = previous;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public DNode<T> getNext() {
		return next;
	}

	public void setNext(DNode<T> next) {
		this.next = next;
	}

	public DNode<T> getPrevious() {
		return previous;
	}

	public void setPrevious(DNode<T> previous) {
		this.previous = previous;
	}

}