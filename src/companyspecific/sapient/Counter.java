package companyspecific.sapient;

public class Counter {
	  static int count;
	  
	  
	  public Counter()
	  {
		  count++;
		  System.out.print(count);
	  }
	  
	  
	public static void main(String[] args) {

  Counter c1= new Counter();
  Counter c2= new Counter();
  Counter c3= new Counter();

	}

}
