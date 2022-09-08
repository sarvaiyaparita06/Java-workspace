package September12022;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeExample {

	public static void main(String[] args) throws IOException 
	{
		Student s1 =new Student(101,"Tops");
		FileOutputStream fout =new FileOutputStream("E://parita.txt");
		try (ObjectOutputStream out = new ObjectOutputStream(fout)) {
			out.writeObject(s1);
		}
		System.out.println("Success");
	}

}
