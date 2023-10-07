package Collections;

public class Book implements Comparable {
	String name ;
	double price;
	int id;
	public Book(String name, double price, int id) {
		super();
		this.name = name;
		this.price = price;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", id=" + id + "]";
	}

	Book() {}

	public int compareTo(Object o) {
		Book temp = (Book) o;
		if(this.price>temp.price)
		    return +1;
		else if (this.price<temp.price)
			return-1;
		else 
			return 0;
	} 

}
