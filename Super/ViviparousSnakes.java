public class ViviparousSnakes extends Super {

 
 // No-argument ViviparousSnakes constructor
 public ViviparousSnakes() {
  // this super will call the parent constructor, which is Super, then it can get access to the parent constructor methods and variables.
  super();
  System.out.println("I am a snake therefore I am a Reptile. " + "I used the super() in my constructor to call my parent Object. ");
 }

 
 // no return type breathe method that calles the respiratory method from the parent class.
 public void breathe() {
  // this method will get access into the parent constructor
  System.out.println("Most reptiles have " + super.respiratory() 
  + " Snakes differ as they only have one lung.");
 }
}
