package companyspecific.others;

import java.util.Arrays;

public class SecondLargestNumberInAnArray {
	   public static void main(String args[])
	   {
	      int temp, size;
	      int array[] = {8,3,7,4,5};
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("Second second largest number is:: "+array[size-2]);
	   
	      int a[] = {8,3,4,6,5};
	      Arrays.sort(a);   
	      System.out.println("Second second largest number is:: "+a[a.length-2]);
	      }
	   }
	