class Main {
  public static void main(String[] args){
    Parent p = new Parent();
    p.name = "Patrick";
    p.greeting();

    /* this will also print in the console even tho there is not relation between the Parent and child, but since we inherited the main on Child
     we now have access to the Parent (its like a copy of Main) */
    Child C = new Child();
    c.name = "Christina";
    c.greeting();
  }
}