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

	public LinkedList(T item) {
		super();
		this.item = item;
		this.next = null;
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
