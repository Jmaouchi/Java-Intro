class Main {
  public static void main(String[] args){

    // Creating BasketBall and pointGuard objects
    BasketBallPlayer shak = new BasketBallPlayer("Shak");
    PointGuard john = new PointGuard("John");

    john.dribbleBall();
    shak.dribbleBall();

    shak.takeShot("slam dunk");

    // Calling teh sport variable from the BallHandler interface
    System.out.println(Balhandler.sport);
    
    // Calling teh Balhandler interface's, concrete method directly from the interface
    // you cant create an object from an interface, thats why we are calling the methods attached by the interface name
    Ballhandleer.dropTheBall();
  }
}