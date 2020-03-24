

import java.util.HashMap;
import java.util.Map.Entry;

public class WordOccurenceHashMap {

	public static void main(String[] args) {

		String string = "My name is Ram Ram";
		String[] split_str = string.split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for (String splited_str : split_str) {
			if (hm.containsKey(splited_str))
				hm.put(splited_str, hm.get(splited_str) + 1);
			else
				hm.put(splited_str, 1);
		}
		
		
		System.out.println(hm);
		
		for (Entry<String, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
		
		
		

	}
}