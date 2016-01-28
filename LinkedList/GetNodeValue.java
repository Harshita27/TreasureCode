/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method.
  
    
    Node node = new Node();
    node=head;
    //int data =0;
    int count=0;
   while(node != null)
       {
       
       node = node.next;
       count += 1;
   }
   // System.out.println(count-1);
   if(n == count-1)
        {
        return head.data;
    }
    int nloop= (count-1)-n;
   Node node1 =  head;
   for(int i = 0; i<nloop; i++)
        {
        node1 = node1.next;   
    }
      return node1.data;
 }
