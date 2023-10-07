package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P3 {
	public static void main(String[] args) throws IOException {
		String path = "D:\\qsp\\P1.txt" ;
		FileInputStream fin = new FileInputStream(path);
		
		int a=fin.read();
		while (a!=1)
		{
			System.out.println((char)a);
		a=fin.read();
		}
		fin.close();
	}


}
