class Parent extends GrandParent {
  String energy;

  // parameterized constructor
  public Parent(String name, String energy){
    super(name);
    this.energy = energy;
  }

  @Override
    public void walk(){
    System.out.println(this.name + " walks normally with " + this.energy + " energy");
    }

}