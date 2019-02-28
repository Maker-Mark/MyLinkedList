import java.util.*;
import java.io.*;

public class DoubleLinked implements iterable{
  //TODO: Implement
  // - public void addFirst();
  // - public void removeFirst();
  // we use linked list for modifications of the middle and end. We dont want to use the get method
  
  private class OurArrayIterator implements Iterator<E>{
  private DListNode<E> iter;
  
  public OurArrayIterator(){
  iter = head;
  }
  
  public boolean hasNext(){
  return iter != null; // as long as iter is not equal to null, we have more to look at
  }
  
  public E next(){
    iter = iter.next;
    return iter.prev.data;//return what we just saw
    
    }
  public void remove(){
    
    //  
  }
    
    // what if we didnt use null stuff and we jsut use a dummy node, 
    // circularly linked list
    // the sentienel's next is the head and the prev is its trail
    
    
    
    /*
    
    addFirst(E value){
    DListNode<E> temp = new DListNode<E>();
    temp.data = value;
    temp.next = sentinel.next;
    temp.prev = sentinel;
    sentinel.next = temp;
    if(numElem ==0 )
    sentinel.prev = temp;
    } numlist++
    
    }
    
    
    
    sentinel = new DListNode<E> ();
    sentinel.data = null
    sentinell prev = sential;
    */
    
  
  }
  
  public static class DListNode <E> 
  {
    public DListNode<E> prev;
    public DListNode<E> next;// pointer to the next item in the list
    public numElem =0;
    private DListNode<E> head, tail;
    public DListNode(){
    head = tail = null;
    }
    
    public void addLast(E data)
    {
      // what if we have an empty list? We will only change the tail, not the head
      DListNode <E> temp = new DListNode  <> ();
      temp.next = null;
      temp.prev = tail;
      tail = temp;
      if(head==null)
        head = temp;// this way we dont loose our head. 
      numElem++;  
    }
    
    public void removeLast()
    {
      if(tail == null)
        throw new NoSuchElementException();
      E old = tail.data;
      if(numElem==1) {
      tail = head = null;// set the head and the tail to null
      }else{// move the tail backwars and set new tail.next to null ecause it exsts.
      tail = tail.prev;
      // what if you dont have a prev? tail = null, which is ok 
      //but we cant do tail.next, we cant touch null like that!
      tail.next = null; // I dont care about the elem next to it
    }
      numElem--;
      return old; // the thing we just deleted 
  }
    
    public E remove(int index)
    {
    // we have edge cases when we want to remove the last element and first.. 
    //lets just call remove first/last
      if(index <0 || index > numElem)
        throw new IndexOutofBoundsException;
      if(index ==0)
        removeFirst();
      if(index == size() -1)
        removeLast();
      
      DListNode<E> nodeToRemove = advanceTo(index); 
      // private method that moves me to the index
      E old = nodeToRemove.data;
      nodeToRemove.prev.next = nodeToRemove.next;
      nodeToRemove.next.prev = nodeToRemove.prev;
      numElem--;
      return old;
    }
    
    
    public E get(int index){
    if(index >=numElem || index <0)
      throw new IndexOutOfBoundsException();
      return advaceTo(index).data;// this returns a ref to the object, and we get its' data
    }
    
    
    
    public void clear(){
      numElem =0;
      head=tail = null;
    }
    
    
    public int indexOf(Object obj){
    int count =0;
      DListNode<E> temp= head;
      while(temp!= null){
        if(temp.data.equals(obj))
            return count;
        count ++;
        temp = temp.next;
      }
    return -1;
      
    }
    
    public E set(int index, E value){

      // Finish implementation
      DListNode<E> temp = 
    
    
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
    
    public boolean remove(Object obj)
    {
    int index = indexOf(obj);
      if(index == -1)
        return false;
      remove(index);
      return true;
    
    }
    
}
    