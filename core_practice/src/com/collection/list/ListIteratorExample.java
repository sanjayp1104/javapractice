package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("AAAA");
		al.add("BBBB");
		al.add("CCCC");
		al.add("DDDD");
		al.add("EEEE");
		al.add("FFFF");
		
		ArrayList<String> al1 = new ArrayList<String>();
		
		al1.add("GGGG");
		al1.add("HHHH");
		al1.add("IIII");
		al1.add("JJJJ");
		al1.add("KKKK");
		al1.add("LLLL");
		
		Iterator<String> it = al.iterator();
		System.out.println("With Iterator");
		System.out.println("AL 1   "+al);
		/*//IllegalStateException
		 * it.remove(); System.out.println("AL 1 After calling remove   "+al);
		 */
		
		while(it.hasNext()) {
			System.out.println("Value "+it.next());
			it.remove();
			
		}
		System.out.println("AL 1 After calling remove   "+al);
		
		
		System.out.println("With ListIterator");
		ListIterator<String> lit = al1.listIterator();
		System.out.println("AL 2"+al1);
		while(lit.hasNext()) {
			System.out.println("Value "+lit.next()+"  -- "+lit.nextIndex());
			if ( lit.nextIndex() == 2 ) {lit.set("AAAA");lit.add("BBBB");} 
		}
		System.out.println(al1);
		System.out.println("Printing with previous");
		while(lit.hasPrevious()) {
			System.out.println("Value "+lit.previous()+"  -- "+lit.previousIndex());
		}
	}

}
