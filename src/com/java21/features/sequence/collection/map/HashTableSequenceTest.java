package com.java21.features.sequence.collection.map;

import java.util.Hashtable;

public class HashTableSequenceTest {

	public static void main(String[] args) {
		//HashTable not supported Sequence collection features 
		Hashtable<Integer, String> hashtable = new Hashtable<>();
		for (int i = 1; i <= 5; i++) {
			hashtable.put(i, "Item:" + i);
		}
		
		System.out.println(hashtable);
		
	}
}
