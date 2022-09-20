package September152022;

public class StartContentsString 
{
	 public static void main(String[] args)
	    {
	        String s1 = "Red is favorite color.";
	        String s2 = "Orange is also my favorite color.";

	        // The String to check the above two Strings to see
	        // if they start with this value (Red).
	        String startStr = "Red";

	        // Do either of the first two Strings start with startStr?
	        boolean starts1 = s1.startsWith(startStr);
	        boolean starts2 = s2.startsWith(startStr);

	        // Display the results of the startsWith calls.
	        System.out.println( s1 + " Starts with " +
	             startStr + "? " + starts1);
	        System.out.println(s2 + " Starts with " +
	             startStr + "? " + starts2);
	    }
}
