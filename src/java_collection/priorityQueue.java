package java_collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueue {
//	Queue<String> q1 = new PriorityQueue();  
//	Queue<String> q2 = new ArrayDeque();
	public static void main(String[] args) {
		PriorityQueue<String> pq= new PriorityQueue<String>();
		pq.add("Koyala");
		pq.add("kaho na pyar hai");
		pq.add("Krissh");
		pq.add("Kartvya");
		pq.add("Karma");
		System.out.println("Head: " +pq.element());
		System.out.println("Head: " +pq.peek());
		System.out.println("Tell: " +pq.hashCode());
		System.out.println("Printing the element before Iterating..........");
		Iterator<String> itr= pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		pq.remove();
		pq.poll();
		System.out.println("After deleting the element from the queue........");
		Iterator<String> itr1= pq.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
