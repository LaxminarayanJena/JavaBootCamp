
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AllCharacterOccurenceHashMap {

	public static void main(String[] args) {
		

		String str= "interview";
		HashMap<Character, Integer> charMapCount = new HashMap<Character, Integer>();
		  
		  for(Character c : str.toCharArray()) {
		   
		   if(charMapCount.containsKey(c)) {
		    charMapCount.put(c, charMapCount.get(c) + 1);
		   } else {
		    charMapCount.put(c, 1);
		   }
		  }
		  
		  
		  System.out.println(charMapCount);
		  for (Entry<Character, Integer> entry : charMapCount.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
		   }
		  
	}


