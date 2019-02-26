import java.util.*;
import java.io.*;

public class MyLinkedList{
  // Singly-linked 
  public class SListNode{
    public String data;
    public SListNode next;// pointer to the next item in the list
    SListNode(String data, SListNode next){
      this.data = data;
      this.next = next;
  }
    public SListNode(){}
    
    // we maintain a refence to the head of a list for
    // O(1) works for empty lists too
    public static SListNode addFirst(SListNode head, String data){
      SListNode temp = new SListNode();
      temp.data = data;
      temp.next = head;
      head = temp; // change the reference 
      return head;
      /* one line version
      return new SListNode(data, head);
      */
    } 
    
    // More complex
    public static removeFirst(SListNode head){
      // with the assumption that there are many elem
      head = head.next;// the current head is now equal to the head reff object's next pointer(the second element)
      // But what if it didnt have a next(EMPTY LIST)
      if(head== null)
        throw NoSuchElementException();
      // but we can have head= null!  
    }
    // O(n); we look at evererelemnt a consytant time. 
    // we need to worry about what happens to both ends of the list
     public static void printAllBackwards(SListNode head){
    if(head == null) // base;
      return;
      printAllBackwards(head.next);// takes me to b, then,c then d, util  i hit null, now I hit the print stmsts and head
       System.out.println(head.data);// these get stacked 
    } 
    public static void printAllForward(SListNode head){
    if(head == null) // base;
      return;
       System.out.println(head.data):
       printAll(head.next);// tail recursion.. only need to remember whats next
    }
    
    public static void printAll(SListNode head){
    SListNode temp = head; // temp is a ref to a slist node, that points to the same thing head does
      while(temp !=null){
      System.out.println(temp.data);
      temp = temp.next; // moves me to the next
        // if this was the last one, it would proint and set temp to null
        // so the while would stop!
      }
    }
  
  public static void main(String[] args){
    LinkedList<String> list;
    list = new LinkedList<>();
    
    list.addAll(Arrays.asList(args)); // takes the command line args
    list.add
  }
  
}
