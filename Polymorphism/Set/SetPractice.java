import java.util.*;

public class SetPractice{

  public void practiceSet(){
    // Creating a Set Object
    // Set<String> anime = new HashSet<>();
    SortedSet<String> anime = new TreeSet<>(); //this will allow us to sort the set by alphabet
  
    // another way of creating a Set
    // HashSet<Integer> anime = new HashSet<Integer>();

    // Add elements to the set
    anime.add("Soul Eater");
    anime.add("Dea the K");
    anime.add("Maka");
    anime.add("Patricia");
    anime.add("Juagtadsa");
    // anime.add(null); // this wont work in a TreeSet

    // loop through the Set (1st way)
    for (String charachters: anime){
     System.out.println(charachters); 
    }

    // loop through the Set (2nd way);
    Iterator<String> iter = anime.iterator();
    while(iter.hasNext()){
      System.out.println(iter.next());
    }

    // break
    System.out.println();

    // get the size of out set
    System.out.println(anime.size());


    // does it contain a specific element?
    if(anime.contains("Maka")){
      System.out.println("collection contains Maka");
    }else{
      System.out.println("collection does not contains Maka");
    }

    // break
    System.out.println();

    for (String characters2: anime){
      System.out.println(characters2);
    }
  }
}

