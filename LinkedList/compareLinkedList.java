/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method
    if((headA == null && headB != null) || (headA !=null && headB == null))
        {
        return 0;
    }
    Node nodeA= new Node();
    nodeA= headA;
    Node nodeB = new Node();
    nodeB = headB;
    int countA=0;
    int countB =0;
    while(nodeA !=null)
        {
        countA +=1;
        nodeA = nodeA.next;
    }
      while(nodeB !=null)
        {
        countB +=1;
          nodeB= nodeB.next;
    }
    
    if(countA != countB)
        {
       return 0;
    }
    else
        {
        nodeA = headA;
        nodeB = headB;
    while(nodeA != null && nodeB != null)
        {
        if(nodeA.data == nodeB.data)
        {nodeA = nodeA.next;
        nodeB = nodeB.next;}
        else
            return 0;
    }}
  return 1;
 }
