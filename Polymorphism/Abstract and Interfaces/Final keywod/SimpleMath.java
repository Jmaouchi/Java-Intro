// we can add final keyword to stop inheritance from this class 
public class SimpleMath {
  public /*final*/ static int POWER =3;

  // method
  public final double add (double num1, double num2){
    return num1+num2;
  }

  public double toTheThirdPower(double num1){
    double product = 2;
    for(int i = 1; i<= POWER; i++){
      product += num1;
      System.out.println("this is the value of product now "+ product);
    }
    return product;
  }
}