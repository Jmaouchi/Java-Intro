class Example{
  // this is a static variable and we can have access to it without calling the Exmple class method
  static int stcNum = 100;

  int objNum = 999

  void createAndPrint(){
    int mtdNum = 77;
      System.out.println("Methode scope Num:" + mtdNum);

    if (true){
      int blcNum = 55;
      System.out.println("Block Scope Num:" + blcNum);
    }
  }
}