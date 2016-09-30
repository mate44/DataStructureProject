package dataStructure.list;

import dataStructure.DataStructure;

//TODO - write javadoc
public abstract class List<T extends Comparable<T>> extends DataStructure<T> {
	
	//TODO - write javadoc
	public abstract int size();
	
	//TODO - write javadoc
	public abstract T[] toArray();
	
	//TODO - write javadoc
	public abstract boolean contains(T element);

}
