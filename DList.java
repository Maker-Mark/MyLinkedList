import java.util.*;
import java.io.*;

public class MyLinkedList implements iterable{
  // Singly-linked 
  public static class DListNode <E> {
    public DListNode prev;
    public DListNode next;// pointer to the next item in the list
    public numElem =0;
   private DListNode<E> head, tail;
   public DListNode(){
   head = tail = null;
    }
    
    public void addLast(E data){
    DListNode <E> temp = new DListNode  <> ();
      temp.next = null;
      temp.prev = tail;
      tail = temp;
      numElem++;g
    
    }
  }
}
    