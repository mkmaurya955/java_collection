package java_collection;

import java.util.Iterator;
import java.util.Vector;

//List <data-type> list1= new ArrayList();  
//List <data-type> list2 = new LinkedList();  
//List <data-type> list3 = new Vector();  
//List <data-type> list4 = new Stack();
public class vector {

	public static void main(String[] args) {
		
		Vector<String> v= new Vector<String>();
		
		v.add("ramakrishan");
		v.add("nagaAnil");
		v.add("atul");
		v.add("kartik");
		
		Iterator<String> itr= v.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
