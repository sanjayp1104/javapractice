package com.practice.map;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("SSSSS", 1);
		hm.put("AAAAA", 2);
		hm.put("NNNNN", 3);
		hm.put("JJJJJ", 4);
		hm.put("AAAAA", 5);
		hm.put("YYYYY", 6);
		
		System.out.println(hm);
		
		Set<Map.Entry<String, Integer>> set = hm.entrySet();
		
		for(Map.Entry <String, Integer> me : set) {
			System.out.println(me.getKey()+"  -  "+me.getValue());
		}
		
		hm.put(null, 100);
		System.out.println("After null key insertion "+hm);
		
		hm.put(null, 101);
		System.out.println("After Second null key insertion "+hm);
	}

}
