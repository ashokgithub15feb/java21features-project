package com.java21.features.sequence.collection.map;

import java.util.Map.Entry;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SequencedCollection;
import java.util.SequencedSet;
import java.util.TreeMap;

public class TreeMapSequenceTest {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		for (int i = 1; i <= 5; i++) {
			treeMap.put(i, "Item:" + i);
		}
		System.out.println(treeMap);
		
		treeMap.put(8, "Item:8");
		treeMap.put(6, "Item:6");
		treeMap.put(7, "Item:7");
		
		System.out.println(treeMap); //its a sorted order
		
		//treeMap.putFirst(9, "Item:9"); //java.lang.UnsupportedOperationException
		//System.out.println(treeMap);
		
		//treeMap.putLast(10, "Item:10"); //java.lang.UnsupportedOperationException
		//System.out.println(treeMap);
				
		Entry<Integer,String> firstEntry = treeMap.firstEntry();
		System.out.println("First Entry: "+firstEntry);
		
		Entry<Integer, String> lastEntry = treeMap.lastEntry();
		System.out.println("Last Entry: "+lastEntry);
		
		SequencedSet<Entry<Integer,String>> sequencedEntrySet = treeMap.sequencedEntrySet();
		System.out.println("sequencedEntrySet: "+sequencedEntrySet);
		
		SequencedSet<Integer> sequencedKeySet = treeMap.sequencedKeySet();
		System.out.println("sequencedKeySet: "+sequencedKeySet);
		
		SequencedCollection<String> sequencedValues = treeMap.sequencedValues();
		System.out.println("sequencedValues: "+sequencedValues);
		
		NavigableMap<Integer,String> reversed = treeMap.reversed();
		System.out.println("Revered: "+reversed);
		
		for(Map.Entry<Integer, String> entry : treeMap.sequencedEntrySet()) {
			System.out.println(entry);
			//treeMap.put(9, "Item:9"); //java.util.ConcurrentModificationException
		}
		
		System.out.println(treeMap);
		Entry<Integer,String> pollFirstEntry = treeMap.pollFirstEntry();
		System.out.println("pollFirstEntry: "+pollFirstEntry);
		System.out.println(treeMap);
		
		Entry<Integer,String> pollLastEntry = treeMap.pollLastEntry();
		System.out.println("pollLastEntry: "+pollLastEntry);
		System.out.println(treeMap);
	}
	
	
}
