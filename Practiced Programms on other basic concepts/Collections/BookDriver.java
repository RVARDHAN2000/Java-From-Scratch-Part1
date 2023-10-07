package Collections;

import java.util.Scanner;

public class BookDriver {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Library l = new Library ();
		l.addBook("A",100,1);
        l.addBook("B",20,2);
        l.addBook("c",12,3);
        l.addBook("D",125,4);
        l.addBook ("E",130,5);
		l.sortBook();
		System.out.println(l.removeBook(4));
		l.addBook("Y", 0, 0);
		l.addBook("Z", 0, 0);
		l.display();
		l.addBook(s.next(),s.nextDouble(),s.nextInt());
		
	}

}
