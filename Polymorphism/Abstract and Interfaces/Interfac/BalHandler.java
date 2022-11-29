interface BallHandler {
  String sport = "Basketball";

  // Method from the Ballhandleer onterface
  public static void dropTheBall(){
      System.out.println("The ball bounces a couple of times, rolls away");
  }

  // Abstract method
  public void dribbleBall();
}