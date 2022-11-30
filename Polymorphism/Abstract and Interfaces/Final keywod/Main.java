class Main {
  public static void main(String[] args) {
    Sub c = new Sub();
    System.out.println(c.add(4,5));
    // This will print 8
    System.out.println(c.toTheThirdPower(2));

    /* Override the POWER variable, this is due to the variable POWER that       doesnt have a final keyword */
    SimpleMath sum = new SimpleMath();
      SimpleMath.POWER = 4;
    //This will print 18
    System.out.println(sum.toTheThirdPower(4));
  }
}