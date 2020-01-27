package java_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {
//	Set<data-type> s1 = new HashSet<data-type>();  
//	Set<data-type> s2 = new LinkedHashSet<data-type>();  
//	Set<data-type> s3 = new TreeSet<data-type>();
	public static void main(String[] args) {
		
		Set<Integer> hs= new HashSet<Integer>();
		
		//HashSet<Integer> hs= new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		
		for(Integer in: hs) {
			System.out.println(in);
		}
		System.out.println("**************************************");
		Iterator<Integer> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
