package starPattern;

public class star {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1 ;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

		
		/*
		*
		**
		***
		****
		*/
		System.out.println("-------------------next program----------------------");
		
		for(int i=1;i<=4;i++)
		{
			for(int j=4 ;j>=i;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
			
		
		
		/*
     ****
     ***
     **
     *
		*/
		System.out.println("-------------------next program----------------------");
	
		for(int i=1;i<=4;i++)
		{
			for(int j=1 ;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=3 ;j>=i;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		

		/*
	* 
	**
	***
	****
	***
	**
	*
		 * 
		 */
		System.out.println("-------------------next program----------------------");
	
		
		for(int i=1; i<=4;i++)
		{
			for(int j=4 ;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
    *
   **
  ***
 ****
		 */
		
System.out.println("-------------------next program----------------------");
	
		
		for(int i=1; i<=4;i++)
		{
			for(int j=4 ;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		/*
	 *
    * *
   * * *
  * * * *
		 */
	}

	System.out.println("-------------------next program----------------------");
	
		
		int i, j, k = 1;
            for (i = 1; i <= 5; i++) {
                for (j = 1; j< i + 1; j++) {
                    System.out.print(k++ + " ");
                }
       
                System.out.println();
            }
		
		/*
	1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
		 */
	}
	
}
