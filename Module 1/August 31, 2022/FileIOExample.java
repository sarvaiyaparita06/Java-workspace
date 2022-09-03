package August312022;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOExample {

	public static void main(String[] args) throws IOException 
	{
		String s="Welcome to Tops";
		try (FileOutputStream fout = new FileOutputStream("E://parita.txt")) {
			fout.write(s.getBytes());
		}
		System.out.println("Success");	
	}

}

