package com.collection.set;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("SSS");
		ts.add("AAA");
		ts.add("NNN");
		ts.add("JJJ");
		ts.add("AAA");
		ts.add("YYY");
		
		System.out.println("Rreeset  -- "+ts);
		
		System.out.println(ts.floor("PPP"));//Searches & returns the greatest element e in TreeSet such that, e<=obj
		System.out.println(ts.floor("JJJ"));
		System.out.println(ts.ceiling("PPP"));//Searches & returns the smallest element e in TreeSet, such that, e>=obj
		System.out.println(ts.higher("PPP"));//Searches and returns an element e in TreeSet, such that e>obj
		System.out.println(ts.lower("PPP"));//Searches and returns any element e in TreeSet such that e
		System.out.println(ts.lower("JJJ"));
		
	}

}
