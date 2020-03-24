package Exception;

public class tryFinally{
	public static void main(String args[]) {
		
		
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		}
		
		

		finally {
			System.out.println("finally block is always executed --");
		}
		
	}
}