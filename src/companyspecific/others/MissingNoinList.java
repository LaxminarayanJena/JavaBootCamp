package companyspecific.others;

import java.util.Arrays;

public class MissingNoinList {

	public static void main(String[] args) {
		int arr[]={2,5,8,10,15};
		  Arrays.sort(arr);
		  int a1=0;
		  for(int i=arr[0];i<arr[arr.length-1];i++)
		  {
		    if(i==arr[a1])
		    {
		      a1++;
		    }
		    else
		    {
		      System.out.print(i + ", ");
		    }
		  }
		  
		}
		}
//3, 4, 6, 7, 9, 11, 12, 13, 14, 