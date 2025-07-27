package com.java21.features.sequence.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SequencedCollection;
import java.util.SequencedMap;
import java.util.SequencedSet;

public class LinkedHashMapSequenceTest {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		for (int i = 1; i <= 5; i++) {
			linkedHashMap.put(i, "Item:" + i);
		}
		
		System.out.println(linkedHashMap);
		
		linkedHashMap.put(6, "Item:6");
		System.out.println(linkedHashMap);
		
		
		linkedHashMap.put(7, "Item:7");
		System.out.println(linkedHashMap);
		
		linkedHashMap.put(8, "Item:8");
		System.out.println(linkedHashMap);
		
		String item7 = linkedHashMap.get(7);
		System.out.println(item7);
		
		
		Entry<Integer,String> firstEntry = linkedHashMap.firstEntry();
		System.out.println("First Entry: "+firstEntry);
		
		Entry<Integer,String> lastEntry = linkedHashMap.lastEntry();
		System.out.println("Last Entry: "+lastEntry);
		
		System.out.println(linkedHashMap);
		
		Entry<Integer,String> pollFirstEntry = linkedHashMap.pollFirstEntry(); //removed the first entry
		System.out.println("Poll First Entry: "+pollFirstEntry);
		
		Entry<Integer,String> pollLastEntry = linkedHashMap.pollLastEntry(); //removed the last entry
		System.out.println("Poll Last Entry: "+pollLastEntry);
		
		System.out.println(linkedHashMap);
		
		
		System.out.println(linkedHashMap);
		
		SequencedSet<Entry<Integer, String>> sequencedEntrySet = linkedHashMap.sequencedEntrySet();
		System.out.println("sequencedEntrySet: "+sequencedEntrySet);
		
		SequencedSet<Integer> sequencedKeySet = linkedHashMap.sequencedKeySet();
		System.out.println("sequencedKeySet: "+sequencedKeySet);
		
		SequencedCollection<String> sequencedValues = linkedHashMap.sequencedValues();
		System.out.println("sequencedValues: "+sequencedValues);
		
		SequencedMap<Integer,String> reversed = linkedHashMap.reversed();
		System.out.println("Revered: "+reversed);
		
		
		for(Map.Entry<Integer, String> entry : linkedHashMap.sequencedEntrySet()) {
			System.out.println(entry);
			//linkedHashMap.put(9, "Item:9"); //java.util.ConcurrentModificationException
		}
		System.out.println(linkedHashMap);
	}
}
