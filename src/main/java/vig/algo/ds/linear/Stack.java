/**
 * 
 */
package vig.algo.ds.linear;

import java.lang.reflect.Array;

import vig.algo.exception.EmptyStackException;
import vig.algo.exception.FullStackException;

/**
 * @author Vignesh
 *
 */
public class Stack<T> {

	private T[] stack;
	private int top;

	public Stack() {
		super();
		top = 0;
	}

	@SuppressWarnings("unchecked")
	public Stack(Class<T> type, int size) {
		super();
		this.stack = (T[]) Array.newInstance(type, size);
		top = 0;
	}

	/**
	 * Push new value to the top of the stack. Throws {@link FullStackException}
	 * when stack is full
	 * 
	 * @param val
	 *            value to push
	 * @return value if the stack is not full
	 * @throws FullStackException
	 * 
	 */
	public T push(T val) throws FullStackException {
		if (top == stack.length) {
			throw new FullStackException();
		} else {
			stack[top] = val;
			top++;
			return val;
		}
	}

	/**
	 * Pop the top node of the stack. Throws {@link EmptyStackException} when
	 * stack is empty.
	 * 
	 * @return the top node of the stack.
	 * @throws EmptyStackException
	 */
	public T pop() throws EmptyStackException {
		if (top >= 0) {
			T val = stack[top];
			stack[top] = null;
			top -= 1;
			return val;
		} else {
			throw new EmptyStackException();
		}
	}

}
