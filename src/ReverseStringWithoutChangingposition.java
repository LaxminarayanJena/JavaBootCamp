
public class ReverseStringWithoutChangingposition {

	public static void main(String[] args) {
		String str = "Test the product";
		 String temp[] = str.split(" ");
		 
		 for (int i = 0; i < temp.length; i++) {

		    for (int j = temp[i].length() - 1; j >= 0; j--) {
		        System.out.print(temp[i].charAt(j));
		        
		    }
		    System.out.print(" ");
		 }

	}

}
