public class Child extends Parent{
  String diaperBrand;

  public Child(String name, String energy, String diaperBrand){
    super(name, energy);
    this.diaperBrand = diaperBrand;
    }
  @Override
    public void walk(){
    System.out.println(this.name + " crawls forward with " + this.energy + " energy while wearing " + this.diaperBrand + " diapers");
  }

}