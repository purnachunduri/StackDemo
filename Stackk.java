
/**
 * Write a description of class Stackk here.
 * 
 * @author (Purna)
 * @version (ver 1.0)
 */
public class Stackk<Purna> {
  Node<Purna> top;
  /**
   * Constructor for objects of class Stackk
   */
  public Stackk() {
    top = null;
  }

    void push(Purna p){
    top = new Node<Purna>(p,top);
  }
  
  void pop() {
    if (top == null) {
      System.out.println("Stack is Empty");
    } else {
      top = top.getNext();
    }
  }
  
  public void print() {
    Node<Purna> v = top;
    if (v == null) {
      System.out.println("List Is Empty");
    } else {
      while (v != null) {
        System.out.println(v.getData());
        v = v.getNext();
      }
    }
  }
  
  public void topElement() {
    if(top == null) {
      System.out.println("Stack is Empty");
    } else {
      System.out.println("Top Element:" + top.getData());
    }
  }
  
}
