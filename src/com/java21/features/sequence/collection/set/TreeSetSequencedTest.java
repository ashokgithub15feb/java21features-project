package com.java21.features.sequence.collection.set;

import java.util.SequencedSet;
import java.util.TreeSet;

public class TreeSetSequencedTest {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Item: 1");
		treeSet.add("Item: 5");
		treeSet.add("Item: 2");
		treeSet.add("Item: 4");
		treeSet.add("Item: 3");
		
		System.out.println(treeSet);
		
		String first = treeSet.getFirst();
		System.out.println("First: "+first);
		String last = treeSet.getLast();
		System.out.println("Last: "+last);
		
		// TreeSet is Order Collection so explicit positioning is not supported.
		// In treeSet addFirst and addLast not allowed
		
		//treeSet.addFirst("Item: 6"); //java.lang.UnsupportedOperationException
		//System.out.println(treeSet);
		
		//treeSet.addLast("Item: 7"); //java.lang.UnsupportedOperationException
		//System.out.println(treeSet);
		
		String removeFirst = treeSet.removeFirst();
		System.out.println("Removed First: "+removeFirst);
		System.out.println(treeSet);
		
		String removeLast = treeSet.removeLast();
		System.out.println("Removed Last: "+removeLast);
		System.out.println(treeSet);
		
		SequencedSet<String> sequencedSetRevered = treeSet.reversed();
		System.out.println(sequencedSetRevered);
	}
}
