package com.java21.features.sequence.collection.list;

import java.util.Stack;

public class StackSequenceTest {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		stack.add("Item 1");
		stack.add("Item 2");
		stack.add("Item 3");
		stack.add("Item 4");
		
		System.out.println(stack);
		
		stack.addFirst("Item 5");
		System.out.println(stack);
		
		stack.addLast("Item 6");
		System.out.println(stack);
		
		String peek = stack.peek();
		System.out.println("Peek: "+peek);
		
		String pop = stack.pop();
		System.out.println("Pop: "+pop);
		
		System.out.println(stack);
		
		String first = stack.getFirst();
		System.out.println("First: "+first);
		String last = stack.getLast();
		System.out.println("Last: "+last);
		System.out.println(stack);
		
		String removeFirst = stack.removeFirst();
		System.out.println("Removed First: "+removeFirst);
		System.out.println(stack);
		
		String removeLast = stack.removeLast();
		System.out.println("Removed Last: "+removeLast);
		System.out.println(stack);
	}
}
