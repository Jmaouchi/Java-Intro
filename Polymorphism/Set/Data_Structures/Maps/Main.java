import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    System.out.println();
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("          ~~~~~~~~~~~~~~~ HashMaps ~~~~~~~~~~~~~~~~~~ ");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");



    // Creating a HashMaps that uses String Keys and Integer Values
    HashMap<String, Integer> areaCodeMap = new HashMap<>();
    areaCodeMap.put("New York", 200);
    areaCodeMap.put("Los Angeles", 310);
    areaCodeMap.put("Seattle", 206);
    areaCodeMap.put("Miami", 305);
    areaCodeMap.put("Texas", 230);

    // change the area code for New York
    areaCodeMap.put("New York", 212);
    // Print the size of out HashMap
    System.out.println("The size of this map is: " + areaCodeMap.size());

    // Print the entry sets of the HashSet (all the sets that are inside the set)
    System.out.println("The enty sets are " + areaCodeMap.entrySet());



    //Adding elements to the map
    //Insertion order is not maintained 
  
  } 
}