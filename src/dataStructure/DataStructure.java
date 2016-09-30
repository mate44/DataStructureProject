package dataStructure;

//TODO - write javadoc
public abstract class DataStructure<T extends Comparable<T>> {
	
	@Override
	//TODO - write javadoc
	public abstract boolean equals(Object obj);
	
	@Override
	//TODO - write javadoc
	public abstract String toString();
	
	//TODO - write javadoc
	public abstract void clear();
	
	//TODO - write javadoc
	public abstract boolean isEmpty();
}
