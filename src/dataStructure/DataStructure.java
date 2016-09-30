package dataStructure;

//TODO - write javadoc
public abstract class DataStructure<T extends Comparable<T>> {
	
	@Override
	public abstract boolean equals(Object obj);
	
	@Override
	public abstract String toString();
	
	//TODO - write javadoc
	public abstract void clear();
	
	/**
	 * Tests if there are any items in the data structure.
	 * @return true, if there are no items in the data structure.
	 */
	public abstract boolean isEmpty();
}
