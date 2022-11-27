class Main{
  public static void main(String[] args) {
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("~~~~~~~~~~~~ Arrays ~~~~~~~~~~~~~~");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

    // To create an array you need first to declare type of data your array holds, then [] brackets and the name of the array.
    String[] supperVillains = {"dr", "doom", "nek", "something", "something_else"};

    // annother way to create an array
    int[] myArray = new int[5];


    // how to access a value at a specific index
    supperVillains[2];

    /* How to save an element of our array to a variable ( here we ara declaring a villain variable that will hold the index 6 on the array 
    which is something_else */
    String villain = supperVillains[6];
    System.out.println(supperVillains[6]) // this should be something_else


    // Lets change the value at a specific index
    supperVillains[4] = "Glactus";
    System.out.println(supperVillains)


    // if we try to access an index in a string array that hold no values in it, we will get a null back, and if its a int array we should get 0 
    int[] arry = new int(5)
      System.out.println(arry[5]) // we will get 0 cuz the array has only 1 index (0)

    // get the length of an array
    System.out.println(supperVillains.length);

    // loop through an array

    for (int i = 0; i < supperVillains.length; i++){
      System.out.println(supperVillains[i]);
    }

    // we also have a for each loop
    for (int villn: supperVillains){
      System.out.println(villn);
    }

    // look at this exmpl
    int[] arr1 = {2,4,6,8};
    int[] arr2 = {1,2,3,5};
    //iterate over the first set of numbers
    for (int i = 0; i < arr1.length; i++) {
      //iterate over the second set of numbers
      for (int j = 0; j < arr2.length; j++) {
        //print the product of the current elements from each set
        System.out.println(arr1[i] * arr2[j]);
        }
      }
    /* the output should be 
      2
      4
      6
      10
      4
      8
      12
      20
      6
      12
      18
      30
      8
      16
      24
      40 and the reason why is that, on every arr1 loop, the arr2 will run all the way, so its 2*1, 2*2, 2*3, 2*5 and so on */
  }
}