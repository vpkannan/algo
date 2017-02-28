/**
 * 
 */
package vig.algo.ds.linear;

/**
 * Represents a doubly linked list
 * 
 * @author Vignesh
 *
 */
public class DoublyLinkedList<T> {

	private DNode<T> head;
	private int size;

	public DoublyLinkedList() {
		super();
		this.head = new DNode<T>();
		this.head.setItem(null);
		this.head.setNext(this.head);
		this.head.setPrevious(this.head);
	}

	public DoublyLinkedList(DNode<T> item) {
		this.head = new DNode<T>();
		this.head.setItem(null);
		this.head.setNext(item);
		this.head.setPrevious(item);
		this.size = 1;
	}

	/**
	 * Delete the tail of the doubly linked list
	 * 
	 * @return true if the node was deleted false if node cannot be deleted, or
	 *         if list is empty
	 */
	public boolean deleteTail() {
		if (this.size == 0) {
			/* List has no nodes */
			return false;
		} else if (this.size == 1) {
			/* List has only one node */
			this.head.setNext(this.head.getNext().getPrevious());
			this.head.setPrevious(this.head.getPrevious().getNext());
			this.size = 0;
			return true;
		} else {
			/* If the list has more than one node */
			this.head.getPrevious().getPrevious().setNext(this.head);
			this.head.setPrevious(this.head.getPrevious().getPrevious());
			this.size--;
			return true;

		}
	}

	public DNode<T> getHead() {
		return head;
	}

	public void setHead(DNode<T> head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

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