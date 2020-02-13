package com.collection.set;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> hs =new HashSet<String>();
		
		hs.add("CCC");
		hs.add("AAA");
		hs.add("BBB");
		hs.add("ZZZ");
		
		System.out.println("HS  "+hs);
		
		hs.remove("BBB");
		
		System.out.println("HS  "+hs);
	}

}
