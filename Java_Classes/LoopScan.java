import java.util.Random;
import java.util.Scanner;

class LoopScan {
  public void scannerLoopExmpl () {
    Random r = new Random();
    int randNum = r.nextInt(11);
    Scanner scan = new Scanner(System.in);
    System.out.println("Guess a number between 0 and 10");
    int guess = scan.nextInt();

    while (guess != randNum) {
      if(guess > randNum) {
        System.out.println('too high')
      }
      if(guess > randNum){
        System.out.println('too low')
      }
      
      System.out.println('guess again');
      guess = scan.nextInt();
    }
    System.out.println('nice job')
  }
}