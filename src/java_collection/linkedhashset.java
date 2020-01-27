package java_collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class linkedhashset {
//	Set<data-type> s1 = new HashSet<data-type>();  
//	Set<data-type> s2 = new LinkedHashSet<data-type>();  
//	Set<data-type> s3 = new TreeSet<data-type>();  
	public static void main(String[] args) {
		Set<Integer> lhs=new LinkedHashSet<Integer>();
		//LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(50);
		
		for(Integer in:lhs) {
			System.out.println(in);
		}
		System.out.println("#######################################");
		Iterator<Integer> itr =lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
