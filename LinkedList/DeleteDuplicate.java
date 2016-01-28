/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    Node node = new Node();
    Node newList = new Node();
    node = head;
    //int temp=0;
   while(node != null && node.next!=null)
       {
      int temp = node.data;
       //node = node.next;
       if(temp == node.next.data)
       {
           node.next = node.next.next;
       }
       else 
           node = node.next;   
   }
return head;
}
