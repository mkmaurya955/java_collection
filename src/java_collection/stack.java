package java_collection;

import java.util.Iterator;
import java.util.Stack;

//List <data-type> list1= new ArrayList();  
//List <data-type> list2 = new LinkedList();  
//List <data-type> list3 = new Vector();  
//List <data-type> list4 = new Stack();
public class stack {

	public static void main(String[] args) {
		Stack<String> ss = new Stack<String>(); 
		ss.push("manish");
		ss.push("Bharat");
		ss.push("Mahabharat");
		ss.push("chapak");
		
		Iterator<String> itr =ss.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
