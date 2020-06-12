package rough;

public class MethodOverridingchchild extends MethodOverRiding{
	
	 int sal=6000;
	
	 
	 public void salary()
		{
		 System.out.println(sal);
		 System.out.println(super.sal);
		 super.a();
		//super is used to access variable of parent class
		//super is used to acess method of parent class
		}
	 
	 
	//runtime polymerphisim
	public void a()
	{
		System.out.println("child");
	}

	public static void main(String[] args) {
		
		
		MethodOverRiding obj= new MethodOverRiding();
		MethodOverRiding obj1= new MethodOverridingchchild();
		MethodOverridingchchild obj2= new MethodOverridingchchild();
		//MethodOverridingchchild obj2= new MethodOverRiding();  cant cast
		obj.a();//parent
		obj1.a();//child
		obj1.sal;//parent salary
		obj2.salary(); 
	    
	}

}
//Method overiding has "is a" relationship

