package dataStructure.list;

import dataStructure.DataStructure;

public abstract class List<T extends Comparable<T>> extends DataStructure<T> {
	
	public abstract int size();
	
	public abstract T[] toArray();
	
	public abstract boolean contains(T element);

}
