/**
 * 
 */
package vig.algo.ds.linear;

/**
 * Represents a singly-linked list
 * 
 * @author Vignesh
 *
 * @param <T>
 *            Represents a generic data type
 */
public class LinkedList<T> {
	private SNode<T> head;
	private int size;

	public LinkedList() {
		super();
		this.head = null;
		size = 0;
	}

	public LinkedList(SNode<T> node) {
		this.head = node;
		size++;
	}

	/**
	 * Inserts a node at the beginning of the list
	 * 
	 * @param item
	 *            The node to be inserted
	 * @return The new head of the list
	 */
	public SNode<T> insertFirst(T item) {
		this.head = new SNode<T>(item, head);
		size++;
		return this.head;
	}

	/**
	 * Deletes the first node of the list
	 * 
	 * @return The new head of the list
	 * 
	 */
	public SNode<T> deleteFirstNode() {
		this.head = this.head.getNext();
		size--;
		return this.head;
	}

	public SNode<T> getHead() {
		return head;
	}

	public void setHead(SNode<T> head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

}

/**
 * Represents a node in the single linked list
 * 
 * @author Vignesh
 *
 * @param <T>
 *            A generic data type for the node
 */
class SNode<T> {

	private T item;
	private SNode<T> next;

	public SNode() {
		super();
		this.next = null;
	}

	public SNode(T item, SNode<T> next) {
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
		this.next = new SNode<>(item, this.next);
	}

	public SNode(T item) {
		this(item, null);
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public SNode<T> getNext() {
		return next;
	}

	public void setNext(SNode<T> next) {
		this.next = next;
	}

}
