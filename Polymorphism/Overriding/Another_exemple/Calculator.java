public class Calculator {
  public static void main(String[] args) {
    //This is our object of Calculator
    Calculator calc = new Calculator();
    // prints "version 1" and returns 9 
    int result1 = calc.add(8, 1);
    //prints the result of the add method 
    //which takes in two int values.
    System.out.println(result1);
    //prints "version 2" and returns 28
    double result2 = calc.add(8, 9, 11); 
    //prints the result of the add method 
    //which takes in three int values.
    System.out.println(result2);
  }

  // Version 1 of add method takes in two int values
  public int add(int a, int b) {
    System.out.println("version 1");
    return a + b; 
  }
  
  // Version 2 of add method takes in three int values
  public double add(int a, int b, int c) {
    System.out.println("version 2");
    return a+b+c; 
  }
}