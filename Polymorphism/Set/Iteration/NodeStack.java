public class Node{
  private Node top;
  

  public void push(int element) {
    Node node = new Node(element);
    push(node);
  }


  public void push(Node node){
    node.setNext(top);
    this.top = (node);
  }


  public void pop() {
    Node poppedNode = top;
    top = top.getNext();
    poppedNode.setNext(null);
    return poppedNode;
  }

  public void peek() {
    return top;
  }




  @Override
  public String toString() {
    return "Node [data=" + data + "]";
  }
}