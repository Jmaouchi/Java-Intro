public class Alien{
  private String name;
  private String color;
  private int antennaCount;

  // non-args constructor  
  // this constructor will be called if there is no parameterized constructor 
  public Alien(){
    System.out.println("Im Alien no-args-constructor called!");
  }

  // parameterized constructor 
  public Alien (String name, String color, int antennaCount){
    this.name = name;
    this.color = color;
    this.antennaCount = antennaCount;
  }

  // methods 
  @Override 
  public String toString(){
    return " the alien " + this.name + " is " + this.color + " and has " + this.antennaCount + " antennas ";
  }

  public String getName(){
    return this.name;
  }

  public String getColor(){
    return this.color;
  }

  public int getAntennaCount(){
    return this.antennaCount;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setColor(String color){
    this.color = color;
  }

  public void setAntennaCount(int antennaCount){
    this.antennaCount = antennaCount;
  } 
}