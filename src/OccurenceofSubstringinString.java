
public class OccurenceofSubstringinString {

	public static void main(String[] args) {
		String str = "asddfss*aarahd";
		 
		int count = ( str.split("aa", -1).length ) - 1;
		 
		System.out.println("Total occurrences: " + count);

	}

}
