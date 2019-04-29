public class ReverseWordsInAString {

		public static void main(String[] args) 
		{ 
			String str = "Welcome to geeksforgeeks"; 
			String temp[] = str.split(" "); 
			String result = ""; 

			for (int i = 0; i < temp.length; i++) { 
				if (i == temp.length - 1) 
					result = temp[i] + result; 
				else
					result = " " + temp[i] + result; 
			} 
			System.out.println(result);
			
			
		} 
	} 

//OP-geeksforgeeks to Welcome
