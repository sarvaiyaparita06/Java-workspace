package September152022;

public class StringComparision
{
	public static void main(String[] args) {
        String s1 = "topsint.com";
        String s2 = "Topsint.com";
        CharSequence cs = "topsint.com";
        
        String s = s1;
        for (int j = 0; j < 2; j++){
            if (s.length() != cs.length()) {
                System.out.printf("Comparing %s and %s: %s\n", s, cs, false);
            } else {
                boolean flog = true;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) != cs.charAt(i)) {
                        flog = false;
                        break;
                    }
                }
                System.out.printf("Comparing %s and %s: %s\n", s, cs, flog);

            }
            s = s2;
        }

    }
}
