package com.java21.features.sequence.collection.queue;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueSequenceTest {

	public static void main(String[] args) {
		//Queue interface not inherited SequenceCollection so PriorityBlockingQueue can not perform SequenceCollection feature.
		PriorityBlockingQueue<String> blockingQueue = new PriorityBlockingQueue<>();
		blockingQueue.add("Item: 1");
		blockingQueue.add("Item: 2");
		blockingQueue.add("Item: 4");
		blockingQueue.add("Item: 3");
		System.out.println(blockingQueue);
		
		String element = blockingQueue.element();
		System.out.println("Element: "+element);
		
	}
}
