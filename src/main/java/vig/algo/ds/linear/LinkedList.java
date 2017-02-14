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
	private Node<T> head;

	public LinkedList() {
		super();
		this.head = null;
	}

	public LinkedList(Node<T> node) {
		this.head = node;
	}

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
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
class Node<T> {

	private T item;
	private Node<T> next;

	public Node() {
		super();
		this.next = null;
	}

	public Node(T item, Node<T> next) {
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
		this.next = new Node<>(item, this.next);
	}

	public Node(T item) {
		this(item, null);
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

}
