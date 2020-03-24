package rough;
public class Employee
{   
    public String empName;
    public int empSalary;
    public String address;

    //default constructor of the class
    public Employee()
    {
    	//this will call the constructor with String param
        this("Chaitanya");
        System.out.println("1");
    }

    public Employee(String name)
    {
    	//call the constructor with (String, int) param
    	this(name, 120035);
    	 System.out.println("2");
    }
    public Employee(String name, int sal)
    {
    	//call the constructor with (String, int, String) param
    	this(name, sal, "Gurgaon");
    	 System.out.println("3");
    }
    public Employee(String name, int sal, String addr)
    {
    	this.empName=name;
    	this.empSalary=sal;
    	this.address=addr;
    	 System.out.println("4");
    }

    void disp() {
    	System.out.println("Employee Name: "+empName);
    	System.out.println("Employee Salary: "+empSalary);
    	System.out.println("Employee Address: "+address);
    	 System.out.println("5");
    }
    public static void main(String[] args)
    {
        Employee obj = new Employee();
        obj.disp();
        System.out.println("6");
    }
}