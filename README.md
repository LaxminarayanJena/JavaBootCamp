
## Programs List
1)Duplicate Elements In Array  <br />
2)FindMissing NumberIn Array <br />
3)Largest And Smallest<br />
4)Reverse Integer<br />
5)Reverse String<br />
6)String Manipulation<br />
7)Swap TwoString<br />
8)Swap Two Variable <br />
## InterviewQuestions
1)OOPS Concepts <br />
2)Difference betwee final and finally <br />
3)Access Modifiers

![accessmodifiers](https://user-images.githubusercontent.com/24494133/44627329-960de580-a949-11e8-8829-685eb59c8f70.PNG)
![final finalize finally](https://user-images.githubusercontent.com/24494133/51971422-15768680-249f-11e9-9806-b9f3a041080b.PNG)
>
#### Exception
- you can have single try and multiple catch </br>
- always Exception e to be written in last catch otherwise "Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception" </br>
- preferance 1st catch block </br>
- only try and finally allowed </br>
- You cannot have multiple try blocks with a single catch block. Each try block must be followed by catch or finally </br>
## Difference between throws,throwable and throw
The Throwable class is the superclass of all errors and exceptions in the Java language.

The key word throws is used in method definition, to declare that a risky method is being called.
Using throws keyword you can declare multiple exception at a time.

```
public static void main(String[] args)throws InterruptedException 
    { 
        Thread.sleep(10000); 
        System.out.println("Hello Geeks"); 
    } 
```


The key word throw  is used to create a new Exception object and throw it
Using throw keyword you can declare only one Exception at a time

```
public void beforeMethod() {
    throw new SkipException("Testing skip.");
     throw new ExplicitAssertionError("element not found");
}
```
## AbstractClass Vs Interface
![AbstractClassVs Interface](https://user-images.githubusercontent.com/24494133/54104952-8773b100-43f7-11e9-8f20-9591825fd5b5.PNG)
####   When to use abstract classes
Consider using abstract classes in following situations:

When you want to share code among several closely related classes.
When you want to have non-static or non-final variables.
If classes that extend your abstract class require access modifiers other than public (such as protected and private).
####  When to use Interfaces
Consider using interfaces in following situations:

If you want to use multiple inheritance.
If you expect that unrelated classes would implement your interface. For example, the interfaces Comparable and Cloneable are implemented by many unrelated classes.
If you want to specify the behavior of a particular method, but not concerned about who implements its behavior.
####  Abstract class has constructor  
when multiple classes extends the abstract class we dont have to use this keyword to refer multiple instance variable of  class we can use super to call the parameterised constructor of parent class
super(i,j) instead of this.i=i and this.j=j
```
//Main-Main method not found in class
//no public-Main method not found in class
//no void-compile time error
//int[]- error
//args-can be changed to anyvalue

//main is public because jvm calls outside from the class
//static- jvm can call directly without creating object
//void- no return type.once the main method is finished executing, 
//java program terminates. So there is no point in returning anything, there is nothing that can be done for the returned object by JVM. If we try to return something from the main method,
//String-Java main method accepts a single argument of type String array. This is also called as java command line argument


//JDK-JRE+Developmenttool-Java Development Kit is the core component of Java Environment and provides all the tools, executables and binaries required to compile, debug and execute a Java Program.
//JRE-JVM+library classes  only wants to run the Java Programs
//JVM-JVM is responsible for converting Byte code to the machine specific code

```
####  String vs StringBuilder vs String Literal 
StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.
Slower execution

StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.
Fasterexecution

String is immutable  ( once created can not be changed )object  . The object created as a String is stored in the  Constant String Pool  .



        //StringBuffer bu=new StringBuffer("hello");  
        //StringBuilder bu=new StringBuilder("hello");  
    	// bu.append("java"); 
         
         //String bu="hello";
        // points to String Pool's location
        String bu= new String("hello");
        //points to Heap Memory location.
        bu.concat("java");
       
        System.out.println(bu);  
        //output for string is hello where as for builder and buffer is hello java
        
        System.out.println is a Java statement that prints the argument passed, into the System.out which is generally stdout.
####  System.out.println
System is a Class
out is a Variable
println() is a method
System is a class in the java.lang package . The out is a static member of the System class, and is an instance of java.io.PrintStream . The println is a method of java.io.PrintStream. This method is overloaded to print message to output destination, which is typically a console or file.
 
 #### This
1)It can be used to refer instance variable of current class. </br>
this.salary=salary </br>
2)invoke current classs constructor </br>
this(id,name) </br>
3)invoke current class method </br>
methodone(this) </br>

 #### Super
super is used to access variable of parent class </br>
super is used to acess method of parent class </br>
super  used to call the parameterised constructor of parent class </br>

![comparable vs comparator](https://user-images.githubusercontent.com/24494133/81765057-85701b00-94f0-11ea-9b02-96b9c7733e7d.PNG)
 #### Wrapper Classes-  
Object representation of primitive type ex- char- Character </br>
AutoBoxing-Conversation of primitive datatype to corresponding class object </br>
Unboxing-Automatic conversation of wrapper class object to primitive data type
```
int i=20;
Integer obj = i;  //boxing
System.out.println(obj);
		
Integer obj1 = new Integer(100);
int j= obj1;   //unboxing
System.out.println(j);

		
ArrayList list = new ArrayList();
list.add(3);
list.add(Integer.valueOf(3)); //autoboxing
```
