package srt;

public class Test {

	    public static void main(String[] args) {
	        String s1 = "abcde";
	        String s2 = "ghijk1234";
			//op-agbhcidjek1234
	        StringBuilder s3 = new StringBuilder();
	        
	        int maxLength = Math.max(s1.length(), s2.length());
	        for (int i = 0; i < maxLength; i++) {
	            if (i < s1.length()) {
	                s3.append(s1.charAt(i));
	            }
	            
	            if (i < s2.length()) {
	                s3.append(s2.charAt(i));
	            }
	        }
	        System.out.println(s3.toString());
	    }
	    
	   
	}
	