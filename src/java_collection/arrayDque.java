package java_collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class arrayDque {

	public static void main(String[] args) {
		//Deque d = new ArrayDeque();
		Deque<String> ad= new ArrayDeque<String>();
//		ArrayDeque<String> ad= new ArrayDeque<String>();
		
		ad.add("Radhe");
		ad.add("Krishan");
		ad.add("Ruksa");
		ad.add("Hulk");
		
		System.out.println(ad);
		System.out.println("///////////////////////////////////");
		
		for(String str :ad) {
			System.out.println(str);
		}
		System.out.println("///////////////////////////////////");
		System.out.println("Before for loop");
		System.out.println("///////////////////////////////////");
		Iterator<String> itr =ad.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
