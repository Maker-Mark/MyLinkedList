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
      // what if we have an empty list? We will only change the tail, not the head
      DListNode <E> temp = new DListNode  <> ();
      temp.next = null;
      temp.prev = tail;
      tail = temp;
      if(head==null)
        head = temp;// this way we dont loose our head. 
      numElem++;  
    }
    
    public void removeLast(){
      if(tail == null)
        throw new NoSuchElementException();
      E old = tail.data;
      if(numElem==1) {
      tail = head = null;// set the head and the tail to null
      }else{// move the tail backwars and set new tail.next to null ecause it exsts.
      tail = tail.prev;
      // what if you dont have a prev? tail = null, which is ok but we cant do tail.next, we cant touch null like that!
      tail.next = null; // I dont care about the elem next to it
    }
      numElem--;
      return old; // the thing we just deleted 
    
  }
    public E remove(int index){
    // we have edge cases when we want to remove the last element and first.. lets just call remove first/last
      if(index <0 || index > numElem)
        throw new IndexOutofBoundsException;
      if(index ==0)
        removeFirst();
      if(index == size() -1)
        removeLast();
      
      DListNode<E> nodeToRemove = advanceTo(index); // private method that moves me to the index
      E old = nodeToRemove.data;
      nodeToRemove.prev.next = nodeToRemove.next;
      nodeToRemove.next.prev = nodeToRemove.prev;
      numElem--;
      return old;
    }
    
    private DListNode<E> advanceTo(int index){
    if(index <0 || index > numElem)
        throw new IndexOutofBoundsException;
      DListNode<E> temp = head;
      int count = 0;
      while(count<index){
      temp = temp.next;
        count++;
      }
      return temp;
    
    }
    public boolean remove(Object obj){
    int index = indexOf(obj);
      if(index == -1)
        return false;
      remove(index);
      return true;
    
    }
    // public void addFirst();
    // public void removeFirst();
}
    