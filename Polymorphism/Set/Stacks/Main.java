import java.util.Stack;

class Main {
  public static void main(String[] args) {
    System.out.println();
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("          ~~~~~~~~~~~~~~~ Stack ~~~~~~~~~~~~~~~~~~ ");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
  
  // FILO: First In Last Out
  // Or LPIFPO: Last Pancake In First Pancake Out

  // Old version for creating a stack 
  Stack<String> kongCharacters = new Stack<>();
  // New version for creating a stack, can work a queue and a stack at the same time 
  /* Deque<String> deck = new ArrayDeque<>(); */ 
  

  kongCharacters.push("Donkey Kong");
  kongCharacters.push("Diddy Kong");
  kongCharacters.push("Dexie Kong");
  kongCharacters.push("Candy Kong");
  kongCharacters.push("Donkey Kong Jr");
  kongCharacters.push("Tiny Kong");

  // Print out all the characters 
  System.out.println(kongCharacters);

  // Print out the ArrayList size or length
  System.out.println(kongCharacters.size());

  // Look at the first object of the kongCharacters arrayList without removing it
  System.out.println(kongCharacters.peek()); 

  
  // Search for a specific element, by distance from the top of the stack (wich is the last element of the array)
  System.out.println(kongCharacters.search("Donkey Kong"));
  
  
  // Removes the object from the top of the stack and returns it (this will remove the last element on the array);
  System.out.println(kongCharacters.pop());


  // Removes the object from the top of the stack and returns it (this will remove the last element on the array);
  while( kongCharacters.empty()){ // if the kongCharacters is empty then do this 
      System.out.println(kongCharacters.pop());
  }
  } 
}