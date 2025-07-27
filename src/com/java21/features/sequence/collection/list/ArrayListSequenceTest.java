package com.java21.features.sequence.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListSequenceTest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			list.add("Item: " + (i + 1));
		}

		System.out.println(list);

		String first = list.getFirst();
		System.out.println("First: " + first);
		String last = list.getLast();
		System.out.println("Last: " + last);

		list.addFirst("New Item: " + 0);
		System.out.println("Modifired List: " + list);

		list.addLast("New Last Item: " + 6);
		System.out.println("Modifired List: " + list);

		list = list.reversed();
		System.out.println("Revered List: " + list);

		list.removeFirst();
		System.out.println("Afetr Remove First Item: " + list);

		list.removeLast();
		System.out.println("After emoved last Item: " + list);

		list = list.reversed();
		System.out.println("Again Reverse List: " + list);

		list.addFirst("Item: 1");
		System.out.println("Added Duplicate Item: " + list);

		System.out.println(list);

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			if (iterator.next().equals("Item: 1")) {
				iterator.remove();
				continue;
			}
			System.out.println(iterator.next());
			// list.addFirst("Item 6"); //java.util.ConcurrentModificationException
			// list.removeFirst(); //java.util.ConcurrentModificationException
		}

		System.out.println("All Item: " + list);
	}
}
