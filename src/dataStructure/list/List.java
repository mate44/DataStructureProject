package dataStructure.list;

import dataStructure.DataStructure;

//TODO - write javadoc
public abstract class List<T extends Comparable<T>> extends DataStructure<T> {
	
	/**
	 * Returns the number of items in the list.
	 * @return the number of items in the list.
	 */
	public abstract int size();
	
	/**
	 * Returns an array representation of the List.
	 * @return an array representation of the List.
	 */
	public abstract T[] toArray();
	
	/**
	 * Is used to test if the List contains the specified element.
	 * @param element is the item we are testing.
	 * @return true if the List contains element.
	 */
	public abstract boolean contains(T element);

}
