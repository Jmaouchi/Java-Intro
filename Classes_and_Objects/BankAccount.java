class BankAccount{
  // first we need tha states
  int accountId
  String accountHolder;
  double accountValue;

  // behaviors
  
  // 1st methode
  void printInfo(){
    System.out.println("Account Holder is:" + accountHolder);
    System.out.println("Account value is:" + accountValue);
  }

  // Get account id
  public int getAccountId(){
    System.out.println("retreving AcountId Id");
    return accountId;
  }

  //Update account id
  public void getAccountId(String idInput){
    System.out.println("update account id to: " + idInput );
    accountId = idInput;
  }

  // Get account holder
  public int getAccountHolder(){
  System.out.println("retreving AcountId Holder");
  return accountHolder;
  }

  //Update account Holder
  public void getAccountId(String name){
    System.out.println("update account holder to: " + name );
    accountHolder = name;
  }

  // Get account value
  public double getAccountValue(){
    System.out.println("retreving AcountId value");
    return accountValue;
  }

  // add funds to account
  public void deposit(double amount){
    System.out.println("Acount value added is now:" + amount);
    accountValue += amount;
    System.out.println("Account value is now:" + getAccountValue());
  }
}