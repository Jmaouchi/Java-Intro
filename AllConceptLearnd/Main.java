import java.util.*;

class Main {
  public static void main(String[] args) {
    ArrayList<Person> family = new ArrayList<>();

    
    GrandParent mary = new GrandParent("Mary");
    GrandParent john = new GrandParent("John");
    Parent amy = new Parent("Amy","medium");
    Parent andy = new Parent("Andy", "low");
    Child annie = new Child("Annie", "high", "Johnson");
  
  
    family.add(mary);
    family.add(john);
    family.add(amy);
    family.add(andy);
    family.add(annie);
    for (Person person : family){
      person.walk();
    }
  
  }
}