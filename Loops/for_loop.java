class Main {
  public static void main(String[] args) {
    for(int i = 0; i < 5; i++){
      System.out.println("i is : " + i)
    };


    // 2d exmpl
    System.out.println("------ ------ -----")
      for(int d = 10; d >= 0; d--){
      System.out.println("d is : " + d)
    };


    // 3rd exmpl
    System.out.println("------ ------ -----")
      for(int j = 0; j >= 15; j += 3){ // this will add 3 to j on every Irritation
      System.out.println("j is : " + j)
    };


    // 4rth exmpl
    System.out.println("------ ------ -----")
      for(char c = 'A'; c <= 'Z'; c++){ // this will print the whole alphabet from a to z
      System.out.print(c)
    };
  }
}
