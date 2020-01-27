package java_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
//List <data-type> list1= new ArrayList();  
//List <data-type> list2 = new LinkedList();  
//List <data-type> list3 = new Vector();  
//List <data-type> list4 = new Stack();
public class arrayList {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("manish");
		al.add("kumar");
		al.add("maurya");
		al.add("MCA");
		System.out.println("#########################################");
		//	for printing the arraylist.........!
		System.out.println(al);
		System.out.println("#########################################");
		//Iterating Collection through the for-each loop
		
		
		for(String str:al) {
			System.out.println(str);
		}
		System.out.println("#########################################");
		
//		Iterating Collection through remaining ways
		//Here, element iterates in reverse order  
        ListIterator<String> litr1=al.listIterator(al.size());  
        while(litr1.hasPrevious())  
        {  	
        	System.out.println(litr1.previous());
        	
//            String str=litr1.previous();  
//            System.out.println(str);  
        } 
        System.out.println("#########################################");
        System.out.println("Traversing list through for loop:");  
        for(int i=0;i<al.size();i++)  
        {  
        	System.out.println(al.get(i));     
        }  
        System.out.println("#########################################");
        System.out.println("Traversing list through forEach() method:");  
//        //The forEach() method is a new feature, introduced in Java 8.  
        al.forEach(a->{ //Here, we are using lambda expression  
          System.out.println(a);  
        });  
        System.out.println("#########################################"); 
        System.out.println("Traversing list through forEachRemaining() method:");  
        Iterator<String> itr=al.iterator();  
        itr.forEachRemaining(a-> //Here, we are using lambda expression  
        {  
        	System.out.println(a);  
        });   	
		
		System.out.println("#########################################");
		Iterator<String> itr1=al.iterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());

		}

	}

}
