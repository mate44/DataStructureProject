package test.list.linkedList;

import org.junit.Test;
import static org.junit.Assert.*;

import dataStructure.list.linkedList.*;

/**
 * Unit tests for the Linked List data structure
 * @author Mat
 *
 */
public class LinkedListTesting {
	public static void main(String[] args) {
	}
	
	/**
	 * Unit test. Checks that the toString method of an empty Linked List returns an empty string.
	 */
	@Test
	public void toStringTest1() {
		LinkedList<String> list = new LinkedList<String>();
		assertEquals("", list.toString() + "");
	}
	
	/**
	 * Unit test. Checks the toString method of LinkedList.
	 */
	@Test
	public void toStringTest2() {
		LinkedList<String> list = new LinkedList<String>("abc");
		assertEquals("abc", list.toString());
	}
	
	/**
	 * Unit test. Checks the toString method of LinkedList.
	 */
	@Test
	public void toStringTest3() {
		LinkedList<String> list = new LinkedList<String>("abc");
		list.append("def");
		list.append("ghi");
		assertEquals("abc, def, ghi", list.toString());
	}
	
	/**
	 * Unit test. Checks the toString method of LinkedList on an Integer.
	 */
	@Test
	public void toStringTest4() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.append(new Integer(4));
		list.append(new Integer(17));
		assertEquals("4, 17", list.toString());
	}
	
	/**
	 * Unit test. Checks the clear method for an empty Linked List.
	 */
	@Test
	public void clearTest1() {
		LinkedList<String> list = new LinkedList<String>();
		list.clear();
		assertTrue(list.isEmpty());
	}
	
	/**
	 * Unit test. Checks the clear method for an Integer Linked List.
	 */
	@Test
	public void clearTest2() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.append(new Integer(1));
		list.append(new Integer(2));
		list.clear();
		assertTrue(list.isEmpty());
	}
	
	/**
	 * Unit test. Checks the size method for an empty Linked List.
	 */
	@Test
	public void sizeTest1() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		assertEquals(0, list.size());
	}
	
	/**
	 * Unit test. Checks the size method for a Double Linked List.
	 */
	@Test
	public void sizeTest2() {
		LinkedList<Double> list = new LinkedList<Double>();
		list.append(new Double(4.0));
		list.append(new Double(8.0));
		assertEquals(2, list.size());
	}
	
	/**
	 * Unit test. Checks the isEmpty method for an empty Linked List.
	 */
	@Test
	public void isEmptyTest1() {
		LinkedList<Double> list = new LinkedList<Double>();
		assertTrue(list.isEmpty());
	}
	
	/**
	 * Unit test. Checks the isEmpty method for a non-empty Linked List.
	 */
	@Test
	public void isEmptyTest2() {
		LinkedList<Double> list = new LinkedList<Double>();
		list.append(new Double(12.0));
		assertFalse(list.isEmpty());
	}
	
	/**
	 * Unit test. Checks the getLast method of an empty Linked List.
	 */
	@Test
	public void getLastTest1() {
		LinkedList<Double> list = new LinkedList<Double>();
		assertNull(list.getLast());
	}
	
	/**
	 * Unit test. Checks the getLast method of an Integer Linked List.
	 */
	@Test
	public void getLastTest2() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.append(new Integer(1));
		list.append(new Integer(2));
		assertEquals(new Integer(2), list.getLast());
	}
	
	/**
	 * Unit test. Checks the append method of a String Linked List.
	 */
	@Test
	public void appendTest1() {
		LinkedList<String> list = new LinkedList<String>();
		assertNull(list.getLast());
		list.append("abc");
		assertEquals("abc", list.getLast());
		list.append("def");
		assertEquals("def", list.getLast());
	}
	
	/**
	 * Unit test. Checks the empty constructor of Linked List.
	 */
	@Test
	public void emptyConstructor() {
		LinkedList<String> list = new LinkedList<String>();
		assertNull(list.getLast());
	}
	
	/**
	 * Unit test. Checks the non-empty constructor of Linked List.
	 */
	@Test
	public void otherConstructor() {
		LinkedList<Double> list = new LinkedList<Double>(new Double(17.0));
		assertEquals(new Double(17.0), list.getLast());
	}
	
}
