package rough;

public class SingleTon {
	
	//restrict object creation outside the class
	private static SingleTon objsingleton;
	private SingleTon()
	{
		
	}
	
	
	public static SingleTon getInstance()
	{
		
		if( objsingleton==null)
				{
			objsingleton= new SingleTon();
				}
		return objsingleton;
		
	}
	
}
