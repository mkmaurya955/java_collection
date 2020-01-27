package java_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class studentArrayList {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"manish",24);
		Student s2 =new Student(2, "kumar", 25);
		Student s3=new Student(3, "Maurya", 26);
		Student s4=new Student(4, "mnaisha", 27);
		
		ArrayList<Student> al=new ArrayList<Student>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		Iterator<Student> itr=al.iterator();
		while(itr.hasNext()) {
			Student std=itr.next();
			System.out.println(std.id+" "+ std.name+" "+ std.age);
			
		}
	}

}
