/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    if(head==null) 
        return head;
 
    Node previous = head;
    Node nextNode = head.next;
 
    head.next = null;
    while(previous!= null){
        Node temp = nextNode.next;
        nextNode.next = previous;
        previous = nextNode;
        if (temp!=null){
            nextNode = temp;
        }else{
            break;
        }
    }
 
    return nextNode;
}
