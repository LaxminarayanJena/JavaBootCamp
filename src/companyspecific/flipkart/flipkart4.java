package companyspecific.flipkart;
import org.testng.annotations.Test;

public class flipkart4 {
	
	
	public static String concat(String a,String b)
	{
		
		if(a==null ||a.equals("")  ||b==null ||b.equals("")) 
  {
	return null;
   }

else
{
	return a+b;
}
	}
	
	
	
	@Test
	public  void add(){
		
		String output =concat("Hello","Flipkart");
		System.out.println(output);

	}

}
