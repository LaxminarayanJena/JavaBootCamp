package companyspecific.flipkart;
class flipkart
{ 
       
public static String printPairs(int arr[], int n, int sum) 
{ 
   
    for (int i = 0; i < n; i++) 
    for (int j = i + 1; j < n; j++) 
    for (int k = j + 1; k < n; k++) 
    if (arr[i] + arr[j] +arr[k] == sum) {
    	return "(" + arr[i] +   ", " + arr[j] + ", " + arr[k] +  ")";
    }
//    else
    	return "";
    
    	 
} 
  
  
public static void main(String []arg) 
{ 
    int arr[] = {4, -2, -4, 1,-2, -6,15}; 
    int n = arr.length; 
    int sum = 0; 
    String output=printPairs(arr, n, sum);
    System.out.println(output);
} 
} 
  