package com.java21.features.sequence.collection.queue;

import java.util.ArrayDeque;

public class ArrayDequeSequenceTest {

	public static void main(String[] args) {
		
		ArrayDeque<String> arrayDeque = new ArrayDeque<>();
		
		for(int i=0; i<16; i++) {
			arrayDeque.add("Item: "+i);
		}
		System.out.println(arrayDeque);
		System.out.println(arrayDeque.size());
		arrayDeque.add("Item: 16");
		System.out.println(arrayDeque.size());
		
		arrayDeque.addFirst("Item: 17");
		arrayDeque.addLast("Item: 18");
		
		System.out.println(arrayDeque);
		
		String removeFirst = arrayDeque.removeFirst();
		System.out.println("Removed First: "+removeFirst);
		
		String removeLast = arrayDeque.removeLast();
		System.out.println("Removed Last: "+removeLast);
		System.out.println(arrayDeque);
		
		String first = arrayDeque.getFirst();
		System.out.println("First: "+first);
		
		String last = arrayDeque.getLast();
		System.out.println("Last: "+last);
	}
}
