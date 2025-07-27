package com.java21.features.common;

public class RecordPattern {

	public static void main(String[] args) {
		
		RecordPattern pattern = new RecordPattern();
		pattern.test(new User(10000, "Ashok"));
	}
	
	record User(int id, String name) {
	}
	
	public void test(Object obj) {
		
		if(obj instanceof User(int id, String name)) {
			System.out.println("User Id: "+id);
			System.out.println("User Name: "+name);
		}
	}
	
}
