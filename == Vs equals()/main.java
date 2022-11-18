// exmpl 1 The output would be: true
/* Comparing two reference variables using the == operator
 will compare the objects' reference address to which each variable points. 
 Remember a reference variable is a variable that points to an object in memory.
  Therefore, it may not return true even if the contents of those two objects are the same. */
public static void main(String[] args) {
  //local variables
  int value = 16;
  int num = 2;

  int value2 = 8;
  int num2 = 4;
 
  int total = value * num;
  int total2 = value2 * num2;
 
  System.out.println(total);
  System.out.println(total2);

  //comparing two primitive variables
  System.out.println(total == total2);
}


// Example 2 The output would be: false
/* Comparing the values of two reference variables with == means comparing whether or not they
 reference the same object. This is because objects have their own place in memory, and each 
 time you create a new object, it'll have its own memory address. Reference variables that don’t 
 point to the same object will hold different memory locations as their values.
 This is why we get false when comparing two string objects that have the same character sequence. */
public class Main{
public static void main(String[] args) {
  String s1 = "Hello Java"; // string literal
  String s2 = "Hello Java"; // string literal
  String s4 = new String("Hello Java"); // string created using object notation

  System.out.println(s1 == s4); //false
}
}