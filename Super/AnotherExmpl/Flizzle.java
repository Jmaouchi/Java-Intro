public class Flizzle extends Alien {
  private int armCount;

  // constructor
  public Flizzle(String name, String color, int antennaCount){
    // this will call the alien constructor
    super(name, color, antennaCount);
    this.armCount = armCount;
  }

  // methods 
  @Override
  public String toString(){
    return super.toString + "it also has" + this.armCout + "arms.";
  } 


  public int getArmCount(){
    return this.armCount;
  }

  public void setAntennaCount(int armCount){
    this.armCount = armCount;
  }
}