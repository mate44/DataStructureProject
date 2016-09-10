package dataStructure;

public abstract class DataStructure<T extends Comparable<T>> {
	
	@Override
	public abstract boolean equals(Object obj);
	
	@Override
	public abstract String toString();
	
	public abstract void clear();
	
	public abstract boolean isEmpty();
}
