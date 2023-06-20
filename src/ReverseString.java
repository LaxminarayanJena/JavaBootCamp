
public class ReverseString {

	public static void main(String[] args) {
		String s = "selenium";
		// string is a Immutable object so no reverse function

		int len=s.length();
		for(int i=len-1; i>=0;i--)
		{	
		System.out.print(s.charAt(i));
		}
		
		
		System.out.println("---------using buffer class-----------");
		
		StringBuffer sf = new StringBuffer(s);
		//stringBuffer is mutable
		System.out.println(sf.reverse());


		System.out.println("---------using while loop-----------");
		
		 String str = "Hello, World!";
	        String reversedString = "";
               int index = str .length() - 1;
	        
	        while (index >= 0) {
	            reversedString += str.charAt(index);
	            index--;
	        }
	        System.out.println(reversedString);
	    }
	}

}
