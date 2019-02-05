
public class OccurenceOfCharacter {

	public static void main(String[] args) {
		
   countChar("addfgh", 'd');
	}
	
	
	public static int countChar(String str, char c)
	{
	    int count = 0;

	    for(int i=0; i < str.length(); i++)
	    {    if(str.charAt(i) == c)
	            count++;
	    }
      System.out.println(count);
	   return count;
	   
	}

}
