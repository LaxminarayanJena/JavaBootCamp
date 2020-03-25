package rough;

public class ThisKeyword {

	/*
1)It can be used to refer instance variable of current class.
this.salary=salary

2)invoke current classs constructor
this(id,name)

3)invoke current class method
methodone(this)
*/

	int employeeid;
	int salary;
	ThisKeyword()
	{
		
	}
	
	ThisKeyword(int employeeid)
	{
	this.employeeid=employeeid;
	
	}
	
	ThisKeyword(int employeeid, int salary)
	{
	this(employeeid);
	this.salary=salary;
	
	}
	
	void Anotherdisplay()
	{
		System.out.println("hello");
	
	}
	
	
	void display()
	{
		System.out.println(employeeid);
		System.out.println(salary);
		this.Anotherdisplay();
	}
	public static void main(String[] args) {
		
		ThisKeyword obj= new ThisKeyword(212, 70000);
				{
			obj.display();
				}
	}

}
