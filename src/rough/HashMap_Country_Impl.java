package rough;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMap_Country_Impl {

	public static void main(String[] args) {
		List<String> name= new ArrayList<>();
		name.add("Tapan");
		name.add("Fugi");
		List<String> name1= new ArrayList<>();
		name1.add("Poltu");
		HashMap<String, List<String>> city = new HashMap<String, List<String>>();
		HashMap<String, HashMap<String, List<String>>> State = new HashMap<String, HashMap<String, List<String>>>();
		
		HashMap<String, HashMap<String, HashMap<String, List<String>>>> country = new HashMap<String, HashMap<String, HashMap<String, List<String>>>>();
		
		city.put("Cuttack", name);
		city.put("Bhubaneswar", name1);
		
		State.put("Odisha", city);
		country.put("India", State);
		
		System.out.println(country);
		

	}

}
