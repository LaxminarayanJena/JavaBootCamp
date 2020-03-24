package rough;

public class basics {

	public static void main(String[] args12) {
		
	String s1="abc";
	String s2= new String("ABC");
	String s3= new String("abc");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s1==s2);
	System.out.println(s1=s2);
	System.out.println(s2=s1);
	System.out.println(s3=s2);

	}

}

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
