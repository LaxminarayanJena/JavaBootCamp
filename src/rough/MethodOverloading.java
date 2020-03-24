package rough;

public class MethodOverloading {
	//compile time polymerphisim

	public static void cal(double a, int b )
	{
		System.out.println(a- b);
	}
	
	public static void cal(int a, double b )
	{
		
		System.out.println(a+ b);
		
	}
	
	
	

	public static void main(String[] args) {
	
		
		cal(3.1,2);
		

	}

}
