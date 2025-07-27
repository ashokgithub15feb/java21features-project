package com.java21.features.sequence.collection.set;

import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class LinkedHashSetSequenceTest {

	public static void main(String[] args) {
		
		SequencedSet<String> sequencedSet = new LinkedHashSet<>();
		sequencedSet.add("Item: 1");
		sequencedSet.add("Item: 2");
		sequencedSet.add("Item: 3");
		sequencedSet.add("Item: 4");
		sequencedSet.add("Item: 5");
		
		System.out.println(sequencedSet);
		
		sequencedSet.addFirst("Item: 6");
		System.out.println(sequencedSet);
		
		sequencedSet.addLast("Item: 7");
		System.out.println(sequencedSet);
		
		String first = sequencedSet.getFirst();
		System.out.println("First: "+first);
		
		String last = sequencedSet.getLast();
		System.out.println("Last: "+last);
		
		System.out.println(sequencedSet);
		
		String removeFirst = sequencedSet.removeFirst();
		System.out.println("Removed First: "+removeFirst);
		
		String removeLast = sequencedSet.removeLast();
		System.out.println("Removed Last:"+ removeLast);
		
		System.out.println(sequencedSet);
		
		
		sequencedSet = sequencedSet.reversed();
		System.out.println("Reversed: "+sequencedSet);
	}
}
