
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

