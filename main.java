// Import the scanner class from the java.util package 
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Place your code within this method
    byte by = 127;
    System.out.println(by);
    byte By = -128;
    System.out.println(By);
    short s = 32_767;
    System.out.println(s);
    short S = -32_768;
    System.out.println(S);
    int i = 2_147_483_647;
    System.out.println(i);
    int I = -2_147_483_648;
    System.out.println(I);
    long l = 9_223_372_036_854_775_807L;
    System.out.println(l);
    double d = 3839.34839;
    System.out.println(d);
    float f = 3839.34839F;
    System.out.println(f);
    float F = 3.14f;
    System.out.println(F);
    boolean on = false;
    System.out.println(on);
    boolean off = true;
    System.out.println(off);
    char c = 'a';
    System.out.println(c);
    char a = 'z';
    System.out.println(a);
    String sentence = "the quick brown fox jumps over the lazy dog";
    System.out.println(sentence);
    String sentenceB = "I mastered Java data types!";
    System.out.println(sentenceB);

    // ask the user for inputs on the consol and then log the result
    // syntax for creating a Scanner object
    Scanner sc = new Scanner(System.in); // the system.in is to tell our Scanner where to look for input 
    // and here it will look on the console, since it's a in at the end 

    // give the user directions in the console
    System.out.println("Enter a number: ");
    // get the user's input
    int num = sc.nextInt();
    System.out.println("User's number is: " + num);

    // give the user directions in the console
    System.out.println("Enter a word: ");
    // get the user's input
    String word = sc.next();
    System.out.println("User's number is: " + word);
    // close scanner object
    sc.close();

  } // End of Main method
} // End of Main class