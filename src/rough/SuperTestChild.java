package rough;

public class SuperTestChild extends SuperTest{



int sal=5000;


void displaySalaries()
{
	System.out.println("sal of parent-"+ super.sal);
	System.out.println("sal of child-"+ sal);
}


void display()
{
	System.out.println("method of child class");
}

void childmethod()
{
	super.display();
	display();
}

public static void main(String[] args) {
	SuperTestChild obj = new SuperTestChild();
	obj.displaySalaries();
	obj.childmethod();
}
}



