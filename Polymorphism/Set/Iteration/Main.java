class Main{
  public static void main() {, 
    int[] intArr = new int[] {48,75,24,15};
    System.out.println("Standard for loop [Array]");
    for(int i = 0; i < intArr.length; i++){
      System.out.println(intArr[i]);
    }
    
    // this method doesnt need to loop through the array using indexes
    System.out.println("Enhanced for loop [Array]");
    for(int a: intArr){
      System.out.println(a)
    }


    NodeStack ns = new NodeStack();
    ns.push(48);
    ns.push(530);
    ns.push(2);
    System.out.println("Enhanced for loop [NodeStack]");
    for(Node n: ns){
      System.out.println(n);
    }

    System.out.println("Iterator using while-loop [NodeStack]");
    Iterator iter = ns.Iterator();
    while(iter.hasNext()){
      System.out.println(iter.hasNext());
    }
  }
} 