class Main{

  // method
  public static void train(Athelete athelete){
    athelete.print();
  }

  // method
  public static void train2(Athelete athelete){
    if(athelete instanceof Snowboarder){
      Snowboarder snowboarder = (Snowboarder)athelete;
      System.out.println("Im a snowboarder! i do backflips and my board is: "+ snowboarder.boardColor );
    }else if (athelete instanceof BasketballPlayer){
    // DownCasting
      BasketballPlayer ballPlayer = (BasketballPlayer) athelete;
      System.out.println("Im a basketball player! i can jump "+         ballPlayer.jumpHeight + " feet high" );
    }  
  }

  public static void main(String[] args) {
    System.out.println("      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Casting objects~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


    // we need some objetcs to cast
    Snowboarder snowboarder = new Snowboarder();
    BasketballPlayer ballPlayer = new BasketballPlayer();


    // this is upcasting because the train method will only take an Athelete object as an argument
    // it can still take snowboraders and basketballPlayers because they can be upcast to Athletes 
    train(snowboarder);
    train(ballPlayer);
 
    System.out.println("      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


    train2(snowboarder);
    train(ballPlayer);
  }
}