package rough;

public class MethodOverridingchchild extends MethodOverRiding{
	
	//runtime polymerphisim
	public void a()
	{
		System.out.println("child");
	}

	public static void main(String[] args) {
		
		
		MethodOverRiding obj= new MethodOverRiding();
		MethodOverRiding obj1= new MethodOverridingchchild();
		//MethodOverridingchchild obj2= new MethodOverRiding();  cant cast
		obj.a();//parent
		obj1.a();//child
	}

}
