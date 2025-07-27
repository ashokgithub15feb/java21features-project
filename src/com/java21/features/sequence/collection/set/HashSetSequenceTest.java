package com.java21.features.sequence.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetSequenceTest {

	//Set interface not inherited SequenceSet so HashSet can not perform SequenceCollection feature.
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		
		for(int i = 0; i < 5; i++) {
			set.add("Item: "+(i + 1));
		}
		
		System.out.println("Set Unique Items: "+set);
		set.add("Item: 1");
		
	}
}
