
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






