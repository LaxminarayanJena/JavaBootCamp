package companyspecific.sapient;

public class Child extends Parent
{
	public void m2()
	{
		System.out.println("def");
	}
	
	public void m3()
	{
		System.out.println("ijk");
	}
	
	
public static void main(String[] args) {
	/*
	Parent obj= new Parent();
	Child obj1=(Child) obj;
	obj1.m2();
	runtime error
	Exception in thread "main" java.lang.ClassCastException: Sapients.Parent cannot be cast to Sapients.Child
	at Sapients.Child.main(Child.java:18)
	
	*/
	
	Parent obj= new Child();
	//obj.m3();
	//compile time error
	//The method m3() is undefined for the type Parent
	
}
}
