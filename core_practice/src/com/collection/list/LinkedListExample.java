package com.collection.list;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> llst = new LinkedList<String>();
		
		llst.add("AAA");
		llst.add("BBB");
		llst.addFirst("000");
		System.out.println("Printing Initial List");
		System.out.println(""+llst);
		
		
		System.out.println("Adding CCC Usung offer");
		llst.offer("CCC");// Add element at last
		System.out.println(""+llst);
		
		
		System.out.println("Firing removeLast");
		llst.removeLast();
		
		System.out.println(""+llst);
		
		System.out.println("Firing removeFirst");
		llst.removeFirst();
		
		System.out.println(""+llst);
		
		
		System.out.println("Adding AAA");
		llst.add("AAA"); // Add elements at end of ll
		System.out.println(""+llst);
		
		System.out.println("Removing using remove()");
		
		llst.remove();// Removes first element of ll
		System.out.println(""+llst);
		
		llst.add("BBB");
		llst.add("ZZZ");
		
		System.out.println("Added BBB twise");
		System.out.println(""+llst);
		
		
		System.out.println("Firing removeFirstOccurrence for BBB");
		llst.removeFirstOccurrence("BBB");
		System.out.println(""+llst);
		
		System.out.println("peek()");//	Returns the head(first) element of the LinkedList, without removing it.
		
		System.out.println(llst.peek());
			
		System.out.println(""+llst);
		
		System.out.println("poll()");//Returns and removes the head(first) element of the LinkedList.
		System.out.println(llst.poll());
		System.out.println(""+llst);
		
		System.out.println("pop()");//Returns and Removes the element at the front of this list  
		llst.pop();
		System.out.println(""+llst);
		
		System.out.println("push(ddd)");// Add element at first
		llst.push("DDD");
		System.out.println(""+llst);
		
		
	}

}
