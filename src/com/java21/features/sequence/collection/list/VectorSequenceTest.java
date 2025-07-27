package com.java21.features.sequence.collection.list;

import java.util.List;
import java.util.Vector;

public class VectorSequenceTest {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<>();
		vector.add("Item 1");
		vector.add("Item 2");
		vector.add("Item 3");
		
		System.out.println(vector);
		
		String first = vector.getFirst();
		System.out.println("First: "+first);
		String last = vector.getLast();
		System.out.println("Last: "+last);
		System.out.println(vector);
		
		vector.addFirst("Item 4");
		System.out.println(vector);
		vector.addLast("Item 5");
		System.out.println(vector);
		
		String removeFirst = vector.removeFirst();
		System.out.println("Removed First: "+removeFirst);
		String removeLast = vector.removeLast();
		System.out.println("Removed Last: "+removeLast);
		
		System.out.println(vector);
		
		List<String> reversed = vector.reversed();
		System.out.println("Reversed: "+reversed);
		
		
		
	}
}
