
public class pallindrome {

	public static void main(String[] args) {
		int r,sum=0,temp;    
		  int n=454;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");   
		  
		  //---------------------
		 
		  String original = String.valueOf(n);
		 String reverse = ""; 
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   
		}  

	}

/////----------------------------------
public class LongestPalindromicSubstring {
    public static String findLongestPalindromicSubstring(String s) {
        int n = s.length();
        boolean[][] isPalindrome = new boolean[n][n];

        int maxLength = 1; // Length of the longest palindromic substring
        int start = 0; // Start index of the longest palindromic substring

        // All substrings of length 1 are palindromes
        for (int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
        }

        // Check for palindromes of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                isPalindrome[i][i + 1] = true;
                maxLength = 2;
                start = i;
            }
        }

        // Check for palindromes of length 3 or more
        for (int length = 3; length <= n; length++) {
            for (int i = 0; i < n - length + 1; i++) {
                int j = i + length - 1;

                if (s.charAt(i) == s.charAt(j) && isPalindrome[i + 1][j - 1]) {
                    isPalindrome[i][j] = true;
                    if (length > maxLength) {
                        maxLength = length;
                        start = i;
                    }
                }
            }
        }

        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String input = "babadmalayalam";
        String longestPalindrome = findLongestPalindromicSubstring(input);
        System.out.println("Longest palindromic substring: " + longestPalindrome);
    }
}


