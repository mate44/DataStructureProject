package dataStructure.list.linkedList;

import dataStructure.list.List;

//TODO - write javadoc
public class LinkedList<T extends Comparable<T>> extends List<T> {
	public static void main(String[] args) {
		//TODO - delete this method
		LinkedList<String> list1 = new LinkedList<String>();
		
		LinkedList<String> list2 = new LinkedList<String>("abc");
		list2.append("def");
		list2.append("ghi");
	}
	
	private LinkedListNode<T> head;
	
	/**
	 * Empty constructor. Creates an empty Linked List.
	 */
	public LinkedList() {
		head = null;
	}
	
	/**
	 * Constructor. Creates a Linked List with the first element.
	 * @param element is the first element in the Linked List.
	 */
	public LinkedList(T element) {
		head = new LinkedListNode<T>(element);
	}
	
	/**
	 * Removes the first matching element from the Linked List, if it exists.
	 * @param element is the element to be removed from the Linked List.
	 */
	public void remove(T element) {
		//TODO - fill in implementation
		//TODO - write unit tests
	}
	
	/**
	 * Removes the element at the specified position.
	 * @param index is the position of the element to be removed.
	 */
	public void remove(int index) {
		if (index < 0) {
			return;
		} else if (index >= this.size()) {
			return;
		} else {
			//Index is valid
			
			if (index == 0) {
				head = head.getNext();
			} else {
				LinkedListNode<T> previous = head;
				LinkedListNode<T> current = head.getNext();
				int currIndex = 1;
				
				//Find the correct position:
				while (currIndex != index) {
					previous = previous.getNext();
					current = current.getNext();
					currIndex++;
				}
				
				previous.setNextNode(current.getNext());
			}
		}
		//TODO - write unit tests
	}
	
	/**
	 * Appends the element to the end of the Linked List.
	 * @param element is the element to be appended.
	 */
	public void append(T element) {
		if (head == null) {
			head = new LinkedListNode<T>(element);
		} else {
			LinkedListNode<T> current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(element);
		}
	}
	
	/**
	 * Inserts the specified element in the list at the specified position.
	 * @param element is the element to be inserted.
	 * @param index is the position to insert the element.
	 */
	public void insert(T element, int index) {
		if (index < 0) {
			return;
		} else if (index > this.size()) {
			return;
		} else if (element == null) {
			return;
		} else {
			//Valid case to insert
			
			LinkedListNode<T> newNode = new LinkedListNode<T>(element);
			
			if (index == 0) {
				LinkedListNode<T> temp = head;
				head = newNode;
				head.setNextNode(temp);
			} else {
				LinkedListNode<T> previous = head;
				LinkedListNode<T> current = head.getNext();
				int currIndex = 1;
				
				//Find the correct position:
				while (currIndex != index) {
					previous = previous.getNext();
					current = current.getNext();
					currIndex++;
				}
				
				//Insert the new Node:
				newNode.setNextNode(current);
				previous.setNextNode(newNode);
			}
		}
		//TODO - write unit tests
	}
	
	/**
	 * Returns the last element in the Linked List.
	 * @return the last element in the Linked List.
	 */
	public T getLast() {
		if (head == null) {
			return null;
		} else {
			LinkedListNode<T> current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			return current.getElement();
		}
	}
	
	/**
	 * Returns the element at the specified position.
	 * @param index is the position we want to get the element of.
	 * @return the element at the specified position.
	 */
	public T getItemAtIndex(int index) {
		if (index < 0) {
			return null;
		} else if (index >= this.size()) {
			return null;
		} else {
			LinkedListNode<T> current = head;
			int currPosition = 0;
			System.out.println(currPosition);//TODO - delete
			while (currPosition != index) {
				current = current.getNext();
				currPosition++;
			}
			return current.getElement();
		}
		
		//TODO - write unit tests
	}
	
	/**
	 * Sorts the elements in the Linked List.
	 */
	public void sort() {
		//TODO - fill in implementation
		//TODO - write unit tests
	}
	
	@Override
	public boolean equals(Object obj) {
		//TODO - fill in implementation
		//TODO - write unit tests
		return false;
	}

	@Override
	public String toString() {
		if (this.size() == 0) {
			return "";
		}
		
		String retString = "";
		LinkedListNode<T> element = head;
		
		for (int i = 0; i < this.size() - 1; i++) {
			retString += element.getElement().toString() + ", ";
			element = element.getNext();
		}
		retString += element.getElement().toString();	//Append the last one so it doesn't finish with a comma
		
		return retString;
	}

	@Override
	public void clear() {
		while (head != null) {
			this.remove(0);
		}
	}

	@Override
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int size() {
		LinkedListNode<T> element = head;
		int count = 0;
		while (element != null) {
			count++;
			element = element.getNext();
		}
		return count;
	}

	@Override
	public T[] toArray() {
		//TODO - fill in implementation
		//TODO - write unit tests
		return null;
	}

	@Override
	public boolean contains(T element) {
		//TODO - fill in implementation
		//TODO - write unit tests
		return false;
	}

}
