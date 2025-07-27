package com.java21.features.common;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class VirtualThread {

	public static void main(String[] args) {
		
		System.out.println("Ashok".hashCode());
		System.out.println("Ashok".hashCode());
		
		
		
		Runnable runnable = () -> {
			for(int i=0; i<10; i++) 
				System.out.println("Inside Runnable: "+i);
		};
		
		//1.
		Thread.startVirtualThread(runnable);
		
		//2.
		Thread virtualThread = Thread.ofVirtual().start(runnable);
		System.out.println("Virtual Thread id: "+virtualThread.getId());
		System.out.println("Virtual Thread Name: "+virtualThread.getName());
		System.out.println("Virtual Thread Priority: "+virtualThread.getPriority());
		
		//3.
		var executor = Executors.newVirtualThreadPerTaskExecutor();
		executor.execute(runnable);
		
		testVitrualThread();
	}
	
	public static int testVitrualThread() {
		try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
		    IntStream.range(0, 10_000).forEach(i -> {
		        executor.submit(() -> {
		            Thread.sleep(Duration.ofSeconds(1));
		            return i;
		        });
		    });
		}
		return 0;
		
	}	
	
}
