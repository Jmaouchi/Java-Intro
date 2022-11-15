class main{
  public static void main(String[] args) {
    BankAcount account = new BankAccount();

    account.accountHolder = "jugurta";
    account.accountValue = 70.70

    account.printInfo();
    System.out.println("Your Account id is :" + account.getAccountId())
  }
}