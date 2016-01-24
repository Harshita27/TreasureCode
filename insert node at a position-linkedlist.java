/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method.
     Node insNode = new Node();
    insNode.data = data;
     insNode.next = null;
    if(head == null)
        {  
       
       return insNode;
    }
    if(position ==0)
        {
        insNode.next = head;
        head =insNode;
        return head;
    }
    Node node = head;
    Node prevNode = new Node();
    int i=0;
   while(node != null && i < position)
       {
       prevNode = node;
      node = node.next;
       i++;
   }
    
    
    insNode.next = prevNode.next;
    prevNode.next = insNode;

    return head;
}
