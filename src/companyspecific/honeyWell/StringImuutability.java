package companyspecific.honeyWell;

public class StringImuutability {

	public static void main(String[] args) {
		String s1= new String ("hello");
		String s2=new String ("abc");
		
		s1.concat(s2);
		
		System.out.println(s1);
		
		
		StringBuffer sb= new StringBuffer("hello");
		sb.append("abc");
		System.out.println(sb);
		
	}

}
