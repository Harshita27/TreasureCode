/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    Node node = new Node();
    Node prevNode = new Node();
    if(head ==null)
        {
        return null;
    }
    if(position == 0)
        {
        head = head.next;
        return head;
    }
    node = head;
    
    int i=0;
   while(node != null && i < position)
       
       {
        prevNode = node;
        node = node.next;
       i++;
    }
    
        prevNode.next = node.next;
    
    if(head ==null)
        {
        return null;
    }
   return head;

}

