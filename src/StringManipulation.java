
public class StringManipulation {

	public static void main(String[] args) {
		String str="the rains have started here";
		String str1="the rains have started here";
		System.out.println(str.length());//size is for array objects
		
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('s')); //1st occurence of s
		System.out.println(str.indexOf('s', 9)); //2nd occurence of s
		System.out.println(str.indexOf('s', str.indexOf('s')+1));	
		System.out.println(str.indexOf("have"));
		System.out.println(str.indexOf("hello")); //-1
		
		//string comparision
		System.out.println(str.equals(str1));//case sensistive
		System.out.println(str.equalsIgnoreCase(str1));
		
		//substring
		System.out.println(str.substring(0, 9));
		
		//trim
		String s=" Hello World    ";
		System.out.println(s.trim());
		
		System.out.println(s.replace(" ", ""));
		
		String date="01-01-2017";//01/01/2017
		System.out.println(date.replace("-", "/"));
		
		//split
		String test="Hello_world_test_selenium";
		String testval[]=test.split("_");
		for(int i=0;i<testval.length;i++)
		{
			System.out.println(testval[i]);
		}
		
		String s2="cares";
		System.out.println(s2.concat("s"));
		
		String x="hello";
		String y="world";
		
		int a=100;
		int b=200;
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		
		////
		
		public static boolean containsAllVowels(String inputString) {
                String vowels = "aeiou";
    
               for (int i = 0; i < vowels.length(); i++) {
                if (inputString.indexOf(vowels.charAt(i)) == -1) {
                 return false;
                }
    }
    
    return true;
}
		
		
	}

}
