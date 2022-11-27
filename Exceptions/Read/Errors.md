# Unchecked vs. Checked Exceptions
The Exception class and all of its subclasses, except for RuntimeException, are known as "checked exceptions".

 These represent occasions where it is reasonable to anticipate an unexpected condition, like a file not existing when attempting to write to it (which would result in a FileNotFoundException).

 

## Checked exceptions must be handled or declared by the programmer - otherwise, the code will not compile.

* FileNotFoundException (I/O Exception) - signals that an attempt to open the file denoted by a specified pathname has failed
* ClassNotFoundException- when the JVM tries to load a particular class but does not find it in the classpath.
* RuntimeException is a special type of exception - it and all its subclasses - are known as "unchecked exceptions".

 

### An unchecked exception is an exception that is not required to be handled or declared like checked exceptions are. Some examples include:

* ArithmeticException for illegal math operations (as we saw in our example)
* IndexOutOfBoundsException for if you reference an index that is greater than the length of an array
* NullPointerException for if you attempt to perform an operation on a reference variable that points to a null value

### Handling / Declaring Exceptions
  When risky code is written that has the possibility of throwing an exception; it can be dealt with in one of two ways:

- Handling means that the risky code is placed inside a try/catch block
- Declaring means that the type of exception to be thrown is listed in the method signature with the throws keyword. This is also called "ducking" - the exception - you let the code which calls the method deal with it.
 

Developers can also force exceptions and handle them ahead of time if we are aware they will happen or that a piece of code written is meant to throw an exception. To do this, we use two keywords one is called throw and the other is throws. There are distinct differences between these two keywords.

 

The throws keyword is used if we know that a method will throw an exception. We put throws in the method signature to signify that our method may throw an exception but doesn’t have to.

 

The throw keyword is used when we want a method to always throw an exception.

 