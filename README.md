
## InterviewQuestions
1)OOPS Concepts <br />
2)Difference betwee final and finally <br />
3)Access Modifiers

![accessmodifiers](https://user-images.githubusercontent.com/24494133/44627329-960de580-a949-11e8-8829-685eb59c8f70.PNG)
![final finalize finally](https://user-images.githubusercontent.com/24494133/51971422-15768680-249f-11e9-9806-b9f3a041080b.PNG)
>

#### Overriding
- Static methods cannot be overridden Overriding is a feature of polymorphism where the method to be executed is determined at runtime based on the actual object type, but static methods are resolved at compile time. <br />

- The main method is static, so it can't be overridden in the usual sense because static methods belong to the class, not to an instance. <br />
- Main method can be overloaded <br/>
- we cannot create an abstract method without it being part of an abstract class or an interface. <br/>
- A functional interface in Java is a special type of interface that contains exactly one abstract method. <br/>
- Static Methods,Final Methods,Private Methods,Final Classes,Constructors cannot be overriden <br/>




#### Constructor
 constructor is similar to the method. The property of the constructor is that it must have the same name as the class name. It has no return type. We do not require to call the constructor manually. It automatically invokes implicitly during the instantiation.

In other words, a constructor is a method that is called at runtime during the object creation by using the new operator. The JVM calls it automatically when we create an object. When we do not define a constructor in the class, the default constructor is always invisibly present in the class. There are the following reasons to use constructors:
We use constructors to initialize the object with the default or initial state. 
 we use the constructor to initialize the instance variable of the class. </br>

 Constructors are not inherited, so you can't override them in the subclass.
super Keyword: You can call the superclass constructor within the subclass constructor using super()
 
 #### Static
 The static keyword in Java is mainly used for memory management. Static variable is a class-level variable that is shared among all instances of the class. Unlike instance variables, which are unique to each object, static variables have the same value for all objects of a class. </br>
 All instances of a class share the same copy of a static variable. If one object modifies the static variable, all other instances will see the updated value.
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

####  JDK,MAIN METHOD
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

Compiler (javac): Translates Java source code to platform-independent bytecode.
Interpreter (JVM): Executes bytecode on the host machine, making Java platform-independent.
JIT Compiler: Optimizes performance by converting bytecode to native machine code at runtime.

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
	
	        String s1 = "LAXMI";
		String s2 = "LAXMI";
		String s3 = new String("LAXMI");
		String s4 = new String("LAXMI");

		System.out.println(s1 == s2); // TRUE  s1 == s2: Both s1 and s2 refer to the same string in the string pool, so this returns true.
		System.out.println(s1 == s3); // FALSE  s1 == s3: s1 refers to the string from the string pool, while s3 is a new object created using new String(), which refers to a 
                                               different object in heap memory, so this returns false.
		System.out.println(s1.equals(s2)); // TRUE
		System.out.println(s1.equals(s3)); // TRUE
		System.out.println(s3 == s4);// FALSE
		
		System.out.println("-----");
		String s5 = "Java";
		String s6 = "Java";
		
		System.out.println(s5 == s6); //true
		System.out.println(s5.equals(s2)); // false
		
		String s7 = new String("Java");
		System.out.println(s6 == s7); //false
		System.out.println(s6.equals(s7)); //true
        
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
```
upcasting means casting the object to a supertype, while downcasting means casting to a subtype.
 myparent obj = new mychild(); //upcasting
 mychild obj1=(mychild)obj; //downcasting
 using obj1 we can call methods in child which is not present in parent
 ```
Debugging-fn+f11 </br>
fn+f6 </br>
```
int i=Integer.parseInt(s); 	
String st = Integer.toString(a);
```		
 #### SingleTon class </br>
Make a constructor private </br>
Write a static method that has return type of object of this singleton class </br>

#### Serialization and deserialisation </br>
[Serialization and deserialisation](http://makeseleniumeasy.com/2022/02/21/rest-assured-tutorial-75-what-is-serialization-and-deserialization-in-rest-assured/#:~:text=Serialization%20is%20a%20conversion%20of,also%20be%20transferred%20over%20networks.)
 
 We generally use POJOs to create JSON payload and convert JSON response payload to Java objects. Converting a POJO object to a JSON object is Serialization and converting a JSON object to a POJO object is called deserialization. These conversions can be done with help of Java libraries like Jackson, Gson etc. 

```
 To create a thread in Java, you have two main approaches: extending the Thread class or implementing the Runnable interface

public class MyThread extends Thread {
    @Override
    public void run() {
        // Code to be executed in the thread
    }
}

MyThread thread = new MyThread();
thread.start();

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        // Code to be executed in the thread
    }
}

MyRunnable runnable = new MyRunnable();
Thread thread = new Thread(runnable);
thread.start();

```
 
 #### Maven Lifecycle </br>
 ![image](https://user-images.githubusercontent.com/24494133/204192354-fe9e8e39-b672-442f-aab8-2562399a8c93.png)

```
           String temp[] = new String[3];
           Scanner obj= new Scanner(System.in)  ;
           for(int i=0;i<temp.length;i++)
           {
               temp[i]=obj.nextLine();
           }

       int[] intArray = {1, 2, 3, 4, 5};

        // Using StringBuilder to convert int array to string
        StringBuilder sb = new StringBuilder();
        for (int num : intArray) {
            sb.append(num);
        }

        // Convert StringBuilder to String
        String result = sb.toString();

        System.out.println(result);  // Output: "12345"
```

  


