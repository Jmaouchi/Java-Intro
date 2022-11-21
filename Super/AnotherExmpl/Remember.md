# What is a Constructor?
  Constructor is just like a method that is used to initialize the state of an object. It is invoked at the time of object creation.

# What is the super keyword?
  The super keyword is used to invoke the overridden method, which overrides one of its superclass methods. This keyword allows to access overridden methods and also to access hidden members of the superclass.
  It also forwards a call from a constructor, to a constructor in the superclass.

# What is the "this" keyword?
  The this keyword refers to the current instance of the class.

# What is required in order to use the super keyword?
  Inheritance as the super refers to the superclass (parent) class

# Usages of the this keyword in Java?
  There are 6 uses...
*  this can be used to refer to the current class instance variable
* this can be used to invoke current class methods (implicitly)
* this() can be used to invoke the current class constructor
* this can be passed as an argument in a method call
* this can be passed as arguments in the constructor call
* this can be used to return the current class instance from a method.

# When can super be used?
Super can be used to...
* refer to the immediate parent class instance variable.
* invoke immediate parent class method.
* super() can be used to invoke immediate parent class constructor.

(Review Super Keyword exercise in Replit to see all three uses)

# Where must super be located in the constructor?
  It MUST be the first line within the subclass (child Class) constructor.

# Java provides us a __________________ if we do not provide on of our own?
  default constructor

# When is a constructor called?
  During the instantiation of a new object

# How do you code a no argument constructor?
  public ClassName(){
  }

# What is the difference between a constructor and a method?
* Constructors do not have return types whereas method must have return types.
* Constructors are used to initialize the state of an object. Whereas methods are used to expose the behavior of the object
* Constructors are invoke implicitly (meaning done by the JVM or tools). Methods are invoked explicitly (meaning done by the developer)
* Java will provide a default constructor if we do not provide one as developers. Developers must always create the methods.
* The Constructor must always have the same name as the class. The name of the method does not have to be the same as the Class.