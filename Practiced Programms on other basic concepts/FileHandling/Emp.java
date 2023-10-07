package FileHandling;

import java.io.Serializable;

public class Emp implements  Serializable  {
	int id;
	String name ;
	double sal;
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	Emp(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	

}
