package August302022;

public class InputString {

	public static void main(String[] args) 
	{
		String str="My name is Parita. I live at 123 Street";
			count(str);
			
		}

		private static void count(String str) {
			char[] ch=str.toCharArray();
			int l=0;
			int s=0;
			int n=0;
			int o=0;
			
			for(int i=0;i<str.length();i++) {
				if(Character.isLetter(ch[i])) {
					l++;
				}
				else if(Character.isDigit(ch[i])) {
					n++;
				}
				else if(Character.isSpaceChar(ch[i])) {
					s++;
				}
				else {
					o++;
				}
			}
			System.out.println("The String is: "+str);
			System.out.println("letter: "+l);
			System.out.println("space: "+s);
			System.out.println("number: "+n);
			System.out.println("other: "+o);
		}
}

