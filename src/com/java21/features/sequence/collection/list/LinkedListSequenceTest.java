package com.java21.features.sequence.collection.list;

import java.util.LinkedList;

public class LinkedListSequenceTest {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Item: 1");
		linkedList.add("Item: 2");
		linkedList.add("Item: 3");
		System.out.println(linkedList);
		
		linkedList.addFirst("Item: 4");
		System.out.println(linkedList);
		
		linkedList.addLast("Item: 5");
		System.out.println(linkedList);
		
		String removeFirst = linkedList.removeFirst();
		System.out.println("Remove First: "+removeFirst);
		System.out.println(linkedList);
		
		String removeLast = linkedList.removeLast();
		System.out.println("Remove Last: "+removeLast);
		System.out.println(linkedList);
		
		String first = linkedList.getFirst();
		System.out.println("First: "+first);
		
		linkedList = linkedList.reversed();
		System.out.println(linkedList);
	}
}
