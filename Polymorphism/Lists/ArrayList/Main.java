import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<String> instruments = new ArrayList<String>();
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    ArrayList<Integer> numbers2 = new ArrayList<Integer>();

    // You can create a string with a name then add it to the arraylist.
    String drums = "Drums";
    instruments.add(drums);
    String violin = "Violin";
    instruments.add(violin);

    // You can also create the string while adding it to the arraylist as well
    instruments.add("Guitar");
    instruments.add(new String("Piano"));
    // first loop
    for (int i = 0; i < instruments.size(); i++) {
      System.out.println(instruments.get(i));
    }
    
    // break
    System.out.println();
    // Remove the item and loop again
    instruments.remove("Violin");
    for (int i = 0; i < instruments.size(); i++) {
      System.out.println(instruments.get(i));
    }
    
    //break
     System.out.println();
    // remove the element that has an index of 1 inside your arrayList and print again
    instruments.remove(1);
     for (int i = 0; i < instruments.size(); i++) {
      System.out.println(instruments.get(i));
    }

    // Start running our 2nd array
    numbers.add(15);
    numbers.add(22);
    numbers.add(99);
    numbers.add(new Integer (75));
    numbers.add(new Integer (16));
    numbers.add(new Integer (2));
    for (int i = 0; i < numbers.size(); i++) {
      System.out.println(numbers.get(i));
    }

    // reverse the 2nd array
    for (int i = numbers.size() -1; i>= 0; i--){
      numbers2.add(i);
      System.out.println(numbers.get(i));
    }
  }
}