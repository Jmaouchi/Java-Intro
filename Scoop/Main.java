class Main {
  // Static variable that you can access wherever you want in your code 
  static String stc = "Class/Static Scope"
  // non static variable
  String objStr = "Object/Instance scope"

  // this is a method of Main class
  public static void mn(String[] args) {  
    // since the stc is a static variable, then we can have access to it in this main object
    System.out.println(stc);
    System.out.println(Main.stc);

    // Get access to a static variable from another class
    System.out.println(Example.stcNum); /* stcNum exist in the Example file and its a static variable */

    Main m = new Main();
    // Get access to the objStr variable from the Main class 
    System.out.println(m.objStr) /* Since the objStr variable is not static, then we cannot have access to it outside of the Main class object
    we need to call new Main() */

    // Getting access to a none static variable in the exmple class object 
    Exmple ex = new Example();
    System.out.println(ex.objNum);


    // Method scope from the Example class
    m.methodeScopeExmple();
    
    // calling CreateAndPrint method from Example class
    ex.createAndPrint();

    // Calling takeInput method
    m.takeInput("Revature")
  }


  // this is a  method of Main class
   void methodeScopeExmple(){
    String mtdStr = "Methode Scope";
    System.out.println(mtdStr);

    // block scope 
    for (int i = 0; i <= 5; i++){
      System.out.println("Block Scope:" + i); // this i cant be accessed outisde of the for loop since its a block scope variable
    }
   }


  // This is a method of Main class
  /* Knowing that the stc and objStr exist inside the Main class, but these ones we have in this method will thak a dfrnt value,
  meaning that a variable can be named the same how many times you want but in dfrnt method or classes; */
  void takeInput(String stc){
    String objStr = "ObjStr inside of method";
    System.out.println("obj:" + objStr);
    System.out.println("Stc:" + stc);

    /* The output should be: obj: ObjStr inside of method and Stc: Revature */

  }
}
