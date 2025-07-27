package com.java21.features.common;

import java.util.ArrayList;
import java.util.List;

public class SequenceCollectionTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.addFirst("FirstElement");
		list.add("E1");
		list.addLast("SecondElement");
		list.add("E2");
		
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.reversed());
		
		System.out.println(list.removeLast());
		
		System.out.println(list);
	}
}
