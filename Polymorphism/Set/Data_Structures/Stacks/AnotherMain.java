import java.util.*;

class AnotherMain {
  public static void main(String[] args) {
    ArrayDeque<String> stack = new ArrayDeque<>();
    // Second stack 
    ArrayDeque<Integer> nm = new ArrayDeque<>();
      
    
    stack.push("Apple");
    stack.push("Banana");
    stack.push("Cherry");
    System.out.println(stack.peek());
    
    // for loop to add values from 0 to 10
    for(int i=10; i>=0; i--){
      nm.push(i);
      System.out.println(i);
    }
  }
}