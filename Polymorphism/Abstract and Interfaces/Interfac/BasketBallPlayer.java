class BasketBallPlayer implements BallHandler. Shooter {
  String name;

  public BasketBallPlayer(String name){
    this.name = name;
  }

  // Implmnt the Ballhandler interface's abstract method. This is required
  @Override
  public void dribbleBall(){
    System.out.println(name+ " dribbles the ball of someone's shoe");
  }

  // Implementing the Shooter interface
  @Override
  public String takeShot(String shot){
    return "the basketball player hits a " + shot + "!";
  }
}