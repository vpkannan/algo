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
	private DNode<T> tail;
	private int size;

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public DoublyLinkedList(DNode<T> item) {
		this.head = item;
		this.tail = item;
		this.size++;
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
			/* List has one node */
			this.head = null;
			this.tail = null;
			this.size--;
			return true;
		} else {
			/* List has more than one nodes */
			this.tail.getPrevious().setNext(null);
			this.tail = this.tail.getPrevious();
			return true;
		}
	}

	public DNode<T> getHead() {
		return head;
	}

	public void setHead(DNode<T> head) {
		this.head = head;
	}

	public DNode<T> getTail() {
		return tail;
	}

	public void setTail(DNode<T> tail) {
		this.tail = tail;
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