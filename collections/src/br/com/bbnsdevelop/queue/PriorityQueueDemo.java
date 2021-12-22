package br.com.bbnsdevelop.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
	
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		
		
		System.out.println(q.peek());
		
		
		for (int i = 10; i <= 30; i++) {
			q.offer(Integer.valueOf(i));
		}
		
		
		System.out.println(q);
		
		
		System.out.println(q.poll());
		
		
		System.out.println(q.remove());
		
		
		System.out.println(q);
	}

}
