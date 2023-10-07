package Collections;

import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		TreeSet<Hotels> t1=new TreeSet<Hotels>();
		t1.add(new Hotels ("H1", "Bang"));
		t1.add(new Hotels ("H2", "Bomb"));
		
		for(Hotels h : t1) {
			System.out.println(h.name+h.loc);
		}

	}

}
