package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Library extends Book {

	ArrayList<Book> al = new ArrayList();
	
	public void addBook (String name, double price, int id) {
	 al.add(new Book(name,price,id));
	
	}

	public String removeBook(int id ) 
	{
		al.remove(--id);
		return "Book Removed successfully of id "+ ++id;
	}

	public Object sortBook() 
	{
		Collections.sort(al);
		return al;
	}
	
	public void display()
	{
		for (Book book : al) {
			System.out.println(book);
			
		}
	}


}
