package companyspecific.flipkart;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class flipkart2 {

	public static void main(String[] args) {
				
		
		int num[]= {1,2,1,2,3,4,5,5};
		
		
		System.out.println("unique elements ");
		HashSet<Integer> set = new HashSet<>(); 
		  
        for (int i=0; i<num.length; i++) 
        { 
            if (!set.contains(num[i])) 
            { 
                set.add(num[i]); 
                System.out.print(num[i] + " "); 
            } 
        } 
        
        System.out.println(" ");
        System.out.println("duplicate elements");
		
		Map<Integer,Integer> storeMap = new HashMap<Integer,Integer>();
		for(int name : num)
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
		
		Set<Entry<Integer,Integer>> entrySet=storeMap.entrySet();
		for(Entry<Integer,Integer>entry :entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey());
			}
		}

	}

}
