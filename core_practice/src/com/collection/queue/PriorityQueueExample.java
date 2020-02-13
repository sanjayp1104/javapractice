package com.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.offer(4);
		pq.offer(1);
		pq.offer(5);
		pq.add(2);
		pq.add(3);
		pq.add(7);
		pq.add(6);
		
		System.out.println(pq);
		
		for(Integer i = pq.poll();i!=null;i=pq.poll()) {
			System.out.println(i);
		}
	}

}
