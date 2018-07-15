import java.util.Arrays;

public class LargestAndSmallest {

	public static void main(String[] args) {
		int[] num= {2,3,-10,60,32};
		int largest = num[0];
		int smallest=num[0];
		
		for(int i=1; i<num.length;i++)
		{
			if(num[i]>largest)
			{
				largest=num[i];
			}
			
			else if(num[i]<smallest)
			{
				smallest=num[i];
			}
		}
		
		System.out.println("given array is "+ Arrays.toString(num));
		System.out.println("largest number is :"+ largest);
		System.out.println("smallest number is :"+ smallest);
		

	}

}
