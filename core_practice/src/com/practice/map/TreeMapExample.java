
package com.practice.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


/**
 * @author sanjay.pamarthi
 *
 */
public class TreeMapExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		tm.put("AAAA", 1);
		tm.put("XXXX", 24);
		tm.put("GGGG", 7);
		tm.put("LLLL", 12);
		tm.put("TTTT", 20);
		
		System.out.println(tm);
		
		Set<Map.Entry<String, Integer>> set = tm.entrySet();
		
		for(Map.Entry<String, Integer> me : set) {
			System.out.println(me.getKey()+" - "+me.getValue());
		}
		//Null Not allowed in tree map
		/*tm.put(null, 100);
		System.out.println("After null key insertion "+tm);
		
		tm.put(null, 101);
		System.out.println("After Second null key insertion "+tm);*/
	}
}
