package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class User {
	public static void main(String[] args) throws IOException {
		String path = "D:\\qsp\\P1.txt" ;
		FileOutputStream fout = new FileOutputStream(path);
		ObjectOutputStream o=new ObjectOutputStream(fout);
		Emp e1 = new Emp(1,"manga",5000);
		System.out.println(e1);
		o.writeObject(e1);
		System.out.println("Object written successfully into file ");
		o.close();
		
	}

}
