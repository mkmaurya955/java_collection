package java_collection;

import java.util.ArrayList;
import java.util.List;

public class bookList {

	public static void main(String[] args) {
		Book b1=new Book(1001,"BhagawatGeeta","murali","Spritual",250);
		Book b2=new Book(1002,"Ramayana","Tulsidas","Spritual",300);
		Book b3=new Book(1003,"Mahabharat","Vyas","Spritual",350);
		Book b4=new Book(1004,"Padmawat","Jaishankar","Spritual",150);
		Book b5=new Book(1005,"Shivpuran","Kabir","Spritual",400);
		
		List<Book> al= new ArrayList<Book>();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		al.add(b5);
		
		for(Book bk:al) {
			System.out.println(bk.bookid +" , "+ bk.bookname +" , "+ bk.bookauthor +" , "+ bk.bookcatagory +" , "+ bk.bookprice);
		}

	}

}
