/*
  Detect cycle in the list
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int HasCycle(Node head) {

    Node slowNode = new Node();
    Node fastNode = new Node();
    slowNode = head;
    fastNode =head;
    while(slowNode != null && fastNode != null)
        {
        slowNode= slowNode.next;
        fastNode = fastNode.next.next;
        if(slowNode==fastNode)
            return 1;
    }

    return 0;
}
