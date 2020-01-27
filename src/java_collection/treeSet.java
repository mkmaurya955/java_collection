package java_collection;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class treeSet {

	public static void main(String[] args) {
		// SortedSet<data-type> set = new TreeSet();
		SortedSet<Integer> ts=new TreeSet<Integer>();
		
//		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		ts.add(20);
		
		for(Integer in :ts) {
			System.out.println(in);
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Iterator<Integer> itr =ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
