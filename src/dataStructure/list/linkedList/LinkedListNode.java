package dataStructure.list.linkedList;

/**
 * Class to represent a Node for the Linked List data structure.
 * @author Mat
 *
 */
public class LinkedListNode<T extends Comparable<T>> {
	private T element;
	private LinkedListNode<T> next;
	
	/**
	 * Constructor for Linked List Node
	 */
	public LinkedListNode(T element) {
		this.element = element;
		next = null;
	}
	
	@Override
	public boolean equals(Object obj) {
		//TODO - fill in implementation
		//TODO - write unit tests
		return false;
	}
	
	/**
	 * Returns the value stored in this node.
	 * @return The value stored in this node (type T).
	 */
	public T getElement() {
		return element;
	}
	
	/**
	 * Returns a reference to the next Node.
	 * @return the next Node.
	 */
	public LinkedListNode<T> getNext() {
		return next;
	}
	
	/**
	 * Sets the value of the next Node.
	 * @param element is the value of the next node.
	 */
	public void setNext(T element) {
		next = new LinkedListNode<T>(element);
	}
	
	/**
	 * Sets the next Node.
	 * @param node is the next Node.
	 */
	public void setNextNode(LinkedListNode<T> node) {
		next = node;
	}
}
