public GranolaBar{
  // propreties
  public String name;
  public String flavor;
  public boolean hasNuts;

  // constructors (no pars)
  public GranolaBar () {
    // this will call a constructor with the same name, and it will check the parameters and in order of these params
    this("Choco-Crazy", "Triple chocolate", false)
    // this is the same than the code on top 
    // this.name = "Choco-Crazy";
    // this.flavor = "Triple chocolate";
    // this.hasNuts = false

    System.out.println("A granolaBar object has been created");
  }

  // parametrized constructor
  public GranolaBar(String name, String flavor, boolean hasNuts){
    // this will resign the 3 values of the main class (GranolaBar)
    this.name = name;
    this.flavor = flavor;
    this.hasNuts = hasNuts;

    
    System.out.println("A granolaBar object has been created");
  }


  // methods
  public String toString(){
    return this.name + " is " + this.flavor + " flavored and has nuts " + this.hasNuts;
  }
}