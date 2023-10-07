package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;




public class User1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String path = "D:\\qsp\\P1.txt" ;
		FileInputStream fin = new FileInputStream(path);
		ObjectInputStream o=new ObjectInputStream(fin);
		Emp e1=(Emp) o.readObject();
		System.out.println(e1.id);
		System.out.println(e1.name);
		o.close();
	}
}
