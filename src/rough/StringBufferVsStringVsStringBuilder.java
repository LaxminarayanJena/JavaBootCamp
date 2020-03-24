package rough;
public class StringBufferVsStringVsStringBuilder {

	public static void main(String[] args) {
		String s="abc";
		String s1="abc";
		System.out.println(s==s1);
		
		String s3=new String("ab");
		String s4=new String("ab");
		System.out.println(s3==s4);
		s.concat("def");		
		
		System.out.println(s);
		
		
		
		StringBuffer sb= new StringBuffer("abc");
		sb.append("def");
		System.out.println(sb);
		
		StringBuilder sbi= new StringBuilder("abc");
		sbi.append("def");
		System.out.println(sbi);

	}

}
