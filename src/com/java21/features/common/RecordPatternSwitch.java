package com.java21.features.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecordPatternSwitch {

	private record Employee(int id, String name) {
	}

	public void recordPatternSwitch(Object obj) {

		switch (obj) {
		
		case Employee(int id, String name) -> System.out.println("Employee Id: " + id + ", Employee Name: " + name);
		
		case String s -> System.out.println("String s: " + s);
		
		case @SuppressWarnings("rawtypes") List l -> System.out.println("List l: " + l);
		
		default -> System.out.println("Default");
		
		}
	}

	public static void main(String[] args) {

		RecordPatternSwitch patternSwitch = new RecordPatternSwitch();

		Employee employee = new Employee(10001, "Ashok");
		patternSwitch.recordPatternSwitch(employee);

		String s = "Ashok";
		patternSwitch.recordPatternSwitch(s);

		List<String> l = new ArrayList<>();
		l.add("Ashok Kumar");
		l.add("Yadav");
		patternSwitch.recordPatternSwitch(l);

		Map<String, String> map = new HashMap<>();
		map.put("1", "One");
		map.put("2", "Two");
		patternSwitch.recordPatternSwitch(map);

	}
}
