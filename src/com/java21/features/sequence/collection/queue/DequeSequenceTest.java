package com.java21.features.sequence.collection.queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeSequenceTest {

	public static void main(String[] args) {
		
		Deque<String> deque = new LinkedList<>();
		deque.add("Item: 1");
		deque.add("Item: 2");
		deque.add("Item: 4");
		deque.add("Item: 3");
		deque.add("Item: 3");
		
		System.out.println(deque);
		
		String first = deque.getFirst();
		System.out.println("First: "+first);
		
		String last = deque.getLast();
		System.out.println("Last: "+last);
		
		deque.addFirst("Item: 5");
		deque.addLast("Item: 6");
		System.out.println(deque);
		
		String remove = deque.remove();
		System.out.println("Removed: "+remove);
		System.out.println(deque);
		
		String removeFirst = deque.removeFirst();
		String removeLast = deque.removeLast();
		
		System.out.println("Removed First: "+removeFirst);
		System.out.println("Removed Last: "+removeLast);
		System.out.println(deque);
		
		deque = deque.reversed();
		System.out.println("Revered: "+deque);
	}
}
