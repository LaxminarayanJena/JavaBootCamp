
public class ReverseString {

	public static void main(String[] args) {
		String s = "selenium";
		// string is a Immutable object so no reverse function

		int len = s.length();
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);// muineles
		}
		System.out.println(rev);
		System.out.println("---------using buffer class-----------");
		
		StringBuffer sf = new StringBuffer(s);
		//stringBuffer is mutable
		System.out.println(sf.reverse());
	}

}
