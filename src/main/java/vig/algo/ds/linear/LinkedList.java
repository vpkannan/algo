/**
 * 
 */
package vig.algo.ds.linear;

/**
 * @author Vignesh
 * 
 *         A single-linked list
 */
public class LinkedList<T> {

	private T item;
	private LinkedList<T> next;

	public LinkedList() {
		super();
		this.next = null;
	}

	public LinkedList(T item, LinkedList<T> next) {
		super();
		this.item = item;
		this.next = next;
	}

	/**
	 * Inserts a new node next to the current node
	 * 
	 * @param item
	 *            The object to be inserted
	 */
	public void insertAfter(T item) {
		this.next = new LinkedList<>(item, this.next);
	}

	public LinkedList(T item) {
		this(item, null);
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public LinkedList<T> getNext() {
		return next;
	}

	public void setNext(LinkedList<T> next) {
		this.next = next;
	}

}
