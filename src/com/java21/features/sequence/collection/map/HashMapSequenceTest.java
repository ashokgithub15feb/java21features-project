package com.java21.features.sequence.collection.map;

import java.util.HashMap;

public class HashMapSequenceTest {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		//HashMap not supported for SequenceCollection features because of HashMap key is inserted in based on the hash key
		for (int i = 1; i <= 5; i++) {
			map.put("Item:" + i, i);
		}
		
		System.out.println(map);
		
	}
}
