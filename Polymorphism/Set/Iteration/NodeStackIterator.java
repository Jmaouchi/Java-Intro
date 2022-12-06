import java.util.Iterator;

public class NodeStackIterator implements Iterator<Node>{
  private Node cursor;
  

  NodeStackIterator(NodeStack stack){
    cursor = stack.peek();
  }

  public boolean hasNext(){
    if(cursor != null) {
      return true;
    }
    return false;
  }

  public void next() {
    Node ret = cursor;
    if(cursor != null){
      cursor = ret.getNext();
    }
    return ret;
  }

}