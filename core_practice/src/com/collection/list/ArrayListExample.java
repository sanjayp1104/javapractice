package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> arr = new ArrayList<String>();//Comment
		arr.add("AAA");
		arr.add("bbb");
		arr.add("ccc");
		arr.add("ddd");
		arr.add("eee");
		arr.add(2, "ZZZZ");
		System.out.println("ArrayList Size  : "+arr.size());
		System.out.println("Elements  : "+arr);
		
		arr.remove(0);
		System.out.println("Elements After remove by index  : "+arr);
		arr.remove("ddd");
		System.out.println("Elements After remove by value  : "+arr);
		
		//arr.clear();
		
		if ( arr.isEmpty() ) {
			System.out.println("List Is Empty");
		}
		Iterator<String> itr = arr.iterator();
		
		while(itr.hasNext()) {
			System.out.println(""+itr.next());
		}
	}

}
