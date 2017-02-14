/**
 * 
 */
package vig.algo.ds.linear;

import java.lang.reflect.Array;

/**
 * @author Vignesh
 *
 */
public class Queue<T> {

	private T[] queue;
	private int front;
	private int back;

	public Queue() {
		super();
	}

	public Queue(Class<T> type, int size) {
		super();
		this.queue = (T[]) Array.newInstance(type, size);
		this.front = 0;
		this.back = 0;
	}

}
