package dataStructure.graph;

import dataStructure.DataStructure;

public class Graph<T extends Comparable<T>> extends DataStructure<T> {
	
	public Graph() {
		
	}
	
	public Graph(T element) {
		
	}
	
	public void merge(Graph<T> graph) {
		
	}
	
	public void addNode(T element) {
		
	}
	
	public void removeNode(T element) {
		
	}
	
	public boolean containsNode(T element) {
		return false;
	}
	
	/*
	 * TODO:
	 * Add the following methods:
	 * -addEdge(T, T)
	 * -removeEdge(T, T)
	 * -containsEdge(T, T)
	 * 
	 * The implementation of these depend on whether I store Edges as an Object, or as an array within a Node.
	 */
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
