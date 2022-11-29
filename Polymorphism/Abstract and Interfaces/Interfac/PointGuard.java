class PointGuard implements BallHandler {
  String name;

  PointGuard(String name){
    this.name = name;
  }

  // Method from the Ballhandleer onterface
  public void dribbleBall(){
      System.out.println(name + " Dribble behind the back");
  }
}