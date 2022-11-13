// Type casting is when you assign a value of one primitive data type to another type.


// We have to do something called casting to fit the double value into a smaller value. Changing 
// from a larger data type to a smaller one is called downcasting. Keep in mind that it could result in data loss when we downcast.

public class Main{

  public static void main(String args[]){

    //  downcasting and losing data:

    int x = 5;
    double y = 6.5;
    // here we are trynig to store data in an int but the y is a double so the result is an int+double and we cant do that 
    // well we can use (int) befor the y and it will work fine
    int z = x + (int) y;

    System.out.println(z);

    // 2nd exmpl 
    
    byte a = 6;
    short b = 7;
    byte c = (byte) (a + b);

    System.out.println(c);


    // 3rd exmpl
    byte aByte = 20;
    short aShort = 50;
    //make sure you wrapp it in a (byte) if not, it wont recognize it
    byte sum = (byte)(aByte + aShort)
    System.out.println(sum)

    // upcasting and losing data: Java will do that for us and we dont need to worry about it

  }
}
