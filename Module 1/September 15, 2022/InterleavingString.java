package September152022;

import java.util.HashSet;
import java.util.Set;

public class InterleavingString 
{
	public static void allInterleavings(String A, String B, String C, Set < String > out) {
		  if (B.length() == 0 && C.length() == 0) {
		   out.add(A);
		   return;
		  }
		  if (B.length() > 0) {
		   allInterleavings(A + B.charAt(0), B.substring(1), C, out);
		  }
		  if (C.length() > 0) {
		   allInterleavings(A + C.charAt(0), B, C.substring(1), out);
		  }
		 }

		 public static void main(String[] args) {
		  String B = "WX";
		  String C = "YZ";
		  System.out.println("Given strings: " + B + "  " + C);
		  System.out.println("Interleaving strings: ");
		  Set < String > out = new HashSet < > ();
		  allInterleavings("", B, C, out);

		  out.stream().forEach(System.out::println);
		 }
}
