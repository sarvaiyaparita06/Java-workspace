package September012022;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOExample {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException 
	{
		String s="Welcome to Tops";
		String home = System.getProperty("user.home");
		try (FileOutputStream fout = new FileOutputStream("/Users/paritasarvaiya/Desktop/Testing/Login.txt")) {
			fout.write(s.getBytes());
		}
		System.out.println("Success");	
	}

}

