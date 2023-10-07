package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class P2 {
	public static void main(String[] args) throws IOException {
		String path = "D:\\qsp\\P2.txt" ;
		FileOutputStream fout = new FileOutputStream(path);
		String data = "I am jobless !";
		byte []b=data.getBytes();
				
		fout.write(b);
		fout.close();
		System.out.println("data written successfully   ");
	}

}
