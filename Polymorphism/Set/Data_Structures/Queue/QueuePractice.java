import java.util.*;
public class QueuePractice{

  public void practiceQueue(){

    // Creating a Queue with a LinkedList implementation class
    Queue<Integer> ticketCount = new LinkedList<>();
  
    
    // add to the Queue
    ticketCount.add(3);
    ticketCount.add(5);
    ticketCount.add(2);
    ticketCount.add(1);
  
    // offer method and its the same than the add method
    ticketCount.offer(10);

    //loop through the Queue
    Iterator<Integer> it = ticketCount.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
  }
}