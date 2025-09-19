
import java.util.HashMap;
import java.util.Map.Entry;

public class CharacterOccurence {

	public static void main(String[] args) {
		
		String str = "MynameisRamRam";
		
		char[] a=str.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (int i = 0; i < a.length; i++)
		    {
			
			      if (hm.containsKey(a[i])) 
			            {
				         hm.put(a[i], hm.get(a[i]) + 1);
			            } 
			                   
			      else 
			      {
				  hm.put(a[i], 1);
			       }

		    }
		
		int maxvalue=Collections.max((hm.values()));
		System.out.println(maxvalue);
		
		for (Entry<Character, Integer> entry : hm.entrySet()) {

			System.out.println(entry.getKey() + "-" + entry.getValue());

		}
	}

}
-------------------------------------------------
	
	String inputString = "Hello, World!";
         int[] charOccurrences = new int[255];
 //The size 256 is chosen to accommodate all possible ASCII characters, 
         //as ASCII values range from 0 to 255.
         // Iterating over each character in the string
         for (char c : inputString.toCharArray()) {
             // Incrementing the occurrence count for the character
             charOccurrences[c]++;
         }

         // Displaying the character occurrences
         System.out.println("Character occurrences in the string:");
         for (int i = 0; i < charOccurrences.length; i++) {
             if (charOccurrences[i] > 0) {
                 System.out.println((char) i + ": " + charOccurrences[i]);
             }
         }}

---------------------------------------------------

	input-aabbccaddd
	output-a2b2c2a1d3
	
	public class CharFrequency {
    public static void main(String[] args) {
        String input = "aabbccaddd";
        StringBuilder result = new StringBuilder();

        int count = 1;
        for (int i = 0; i < input.length(); i++) {
            // If next char is the same, increase count
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                // Append char + count, then reset count
                result.append(input.charAt(i)).append(count);
                count = 1;
            }
        }

        System.out.println(result.toString());
    }
}






















