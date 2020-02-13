package com.practice.concerrentcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcModifyExample {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("SSSS");
		al.add("AAAA");
		al.add("TTTT");
		al.add("EEEE");
		al.add("XXXX");
		
		Iterator<String> itr = al.iterator();
		
		//for(String ss : itr) {
			
		//}
		for(String str : al) {
			System.out.println(""+str);
			//al.add("SQS");//Exception in thread "main" java.util.ConcurrentModificationException
		}
		//Copy.
		System.out.println("Concurrent List");
		List<String> nlst = new CopyOnWriteArrayList<String>();
		nlst.add("SSSS");
		nlst.add("AAAA");
		nlst.add("TTTT");
		nlst.add("EEEE");
		nlst.add("XXXX");
		
		Iterator<String> itr1 = nlst.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(""+itr1.next());
			nlst.add("EXTRA");
		}
		System.out.println("After adding while traversing");
		//itr1.
		itr1 = nlst.iterator();
		while(itr1.hasNext()) {
			System.out.println(""+itr1.next());
			//nlst.add("EXTRA");
		}
		ListIterator<String> litr = nlst.listIterator();
		//litr.
		
		
	}

}
