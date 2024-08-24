
public class ReverseStringWithoutChangingposition {

	public static void main(String[] args) {
		String str = "Test the product";
		 String temp[] = str.split(" ");
		 
		 for (int i = 0; i < temp.length; i++) {

		    for (int j = temp[i].length() - 1; j >= 0; j--) {
		        System.out.print(temp[i].charAt(j));
		        
		    }
		    System.out.print(" ");
		 }

	}

}
//O/P-tseT eht tcudorp 

///2nd program-- String str="My name is tom" Output- "My eman is mot" using java

public class ReverseWords {
    public static void main(String[] args) {
        String str = "My name is tom";
        String[] words = str.split(" ");
        
        // Reverse the necessary words
        words[1] = new StringBuilder(words[1]).reverse().toString();
        words[3] = new StringBuilder(words[3]).reverse().toString();
        
        // Join the words back into a single string
        String result = String.join(" ", words);
        
        System.out.println(result);
    }
}


-----------------------------------------------------------------------------------
	public class ReverseWordsManually {
    public static void main(String[] args) {
        String str = "My name is tom";
        String[] words = str.split(" ");
        
        // Manually reverse the necessary words
        words[1] = reverseManually(words[1]);
        words[3] = reverseManually(words[3]);
        
        // Join the words back into a single string
        String result = String.join(" ", words);
        
        System.out.println(result);
    }

    // Method to reverse a string manually
    public static String reverseManually(String word) {
        char[] letters = word.toCharArray();
        String reversed = "";
        for (int i = letters.length - 1; i >= 0; i--) {
            reversed += letters[i];
        }
        return reversed;
    }
}

