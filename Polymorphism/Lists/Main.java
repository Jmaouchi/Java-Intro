import java.util.*;

class Main {
  public static void main(String[] args) {
    List<Integer> intListExample = ListCreator.generateIntArrayList();
    System.out.println("Integers you added to the first list:");
    for (Integer num : intListExample) {
        System.out.println(num);
    }

    // 2nd algorithm
    List<Integer> intList = ListCreator.generateIntArrayList();
      int max = intList.get(0);
       for (Integer i : intList) {
         if(i>max){
           max = i;
         }
        }
      System.out.println("Maximum number in second list is :"+max);
  }
}