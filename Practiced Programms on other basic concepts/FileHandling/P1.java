package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class P1 {
	public static void main(String[] args) throws IOException {
		String path = "D:\\qsp\\P1.txt" ;
		FileOutputStream fout = new FileOutputStream(path);
		fout.write('A');
		fout.close();
		System.out.println("data written successfully   ");
	}

}
