package java_collection;

import java.util.Iterator;
import java.util.LinkedList;
//List <data-type> list1= new ArrayList();  
//List <data-type> list2 = new LinkedList();  
//List <data-type> list3 = new Vector();  
//List <data-type> list4 = new Stack();
public class linkedList {

	public static void main(String[] args) {
		
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("mohan");
		ll.add("Sohan");
		ll.add("Roshan");
		ll.add("Rohit");
		
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
