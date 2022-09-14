package September132022;

public class CharacterString 
{
	 public static char
	    getCharFromString(String str, int index)
	    {
	        return str.charAt(index);
	    }
	 
	 public static void main(String[] args)
	 {
		 String str = "Tops Technologies!";
		 int index = 8;
		 char ch = getCharFromString(str, index);
	  
	     System.out.println("Character from " + str + " at index " + index + " is " + ch);
	 }
}
