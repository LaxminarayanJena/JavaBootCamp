import java.util.HashMap;
import java.util.Map.Entry;

public class WordOccurence {

	public static void main(String[] args) {
		
		String string = "My name is Ram Ram";
		String[] a = string.split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

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
		for (Entry<String, Integer> entry : hm.entrySet()) {

			System.out.println(entry.getKey() + "-" + entry.getValue());

		}
	}

}
