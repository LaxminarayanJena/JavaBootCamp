
public class prime {

	public static void main(String[] args) {
		
		//check prime no
		
		int no=70;
		int temp=0;
		for(int i=2; i<=no-1;i++)
		{
			if(no%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("no is prime");
		}
		else
		{
			System.out.println("no is not prime");
		}
		
	
		//----------------print prime no between 1 to 100--------;
		// int temp=0;
		for( int i=1; i<=100;i++)
		{
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					temp =temp+1;
					
				}
			}
			
			if(temp==0)
			{
				System.out.print(i +",");
				
			}
			else
			{
				temp=0;
			}
		}
	}
}
