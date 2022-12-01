public class AnotherList{
  public static void main(String[] args){

    // creating an ArrayList that can hold Integer objects
     ArrayList<Integer> list = new ArrayList<>();

    // adding to the queue
     list.add(1);
     list.add(2);
     list.add(3);
     list.add(4);
     list.add(5);

    // removing from the list using an index
     list.remove(0);

    // printing out the list
     System.out.println(list);
   }
}


// or this for strings 


public class Main{
  public static void main(String[] args){

    // creating an ArrayList that can hold Integer objects
     ArrayList<String> list = new ArrayList<>();

    // adding to the queue
     list.add("dfsuytghj");
     list.add("sdf");
     list.add("douchaaaaaaaaaaa");
     list.add("sdfsd");
     list.add("Sdfsdf");

    // removing from the list using an index
    list.remove(0);
    String max = list.get(0);
    for(String i : list){
      int ilength = i.length();
      if( ilength > max.length()){
        max = i;
      }
    }

    // printing out the list
    System.out.println("The list is: "+list);
    System.out.println("The largest string is: "+max);
   }
}