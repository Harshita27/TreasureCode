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

void ReversePrint(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method.
  
    Node node = new Node();
    node = head;
    ArrayList<Integer> nodeData = new ArrayList();
    while(node != null)
        {
        nodeData.add(node.data);
        node= node.next;
    }

    for(int i =nodeData.size()-1; i>=0; i--)
        {
        System.out.println(nodeData.get(i));
    }
    
}
