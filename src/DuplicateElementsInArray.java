import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		String names[]= {"java","qtp","ruby","java","c","ruby"};
		
		//1.compare elements o(n*n) -worst solution
		
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if (names[i].equals(names[j]))
				System.out.println("duplicate element is :" + names[i]);
			}
		}
		
		//2.using hashset:java collection : it stores unique values: //o(n)
		
		Set<String> store = new HashSet<String>();
		//Set-Interface
		//HashSet-Class
		for(String name :names)
		{
			if(store.add(name)== false)
			{
				System.out.println("duplicate element is :" +name);
			}
		}
		//3.using hashmapo(2n)
		Map<String,Integer> storeMap = new HashMap<String,Integer>();
		for(String name : names)
		{
			Integer count=storeMap.get(name);
			if(count== null)
			{
				storeMap.put(name, 1);
			}
			
			else
			{
				storeMap.put(name, ++count);
			}
		}
		
		//get the values from hashmap
		Set<Entry<String,Integer>> entrySet=storeMap.entrySet();
		for(Entry<String,Integer>entry :entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.println("duplicate element is :" +entry.getKey());
			}
		}
		
		
		

	}

}
