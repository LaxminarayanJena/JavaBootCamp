import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateNumbersInArray {

	public static void main(String[] args) {
		
		int names[]= {1,2,3,3,5,6,6};
		
		
		//2.using hashset:java collection : it stores unique values: //o(n)
		
		Set<Integer> store = new HashSet<Integer>();
		//Set-Interface
		//HashSet-Class
		System.out.println("duplicate element is :" +store);
		for(Integer name :names)
		{
			if(store.add(name)== false)
			{
				System.out.println("duplicate element is :" +name);
			}
		}
		

	}

}