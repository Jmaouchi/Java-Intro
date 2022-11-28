class Main{
  public static void main(String[] args){

    Ocarina c = new Ocarina();
    c.color = "blue";
    System.out.println("my color is"+c.color);

    // this is the better way 
    c.setSong("hello helloooooo")
    System.out.println("my color is"+ c.setSong());
  }
}