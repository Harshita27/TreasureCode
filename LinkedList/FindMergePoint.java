/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
    Node nodeA = new Node();
    Node nodeB = new Node();
    
    int a = countNode(headA);
    int b = countNode(headB);
    //System.out.println("alist"+a);
    //System.out.println("blist"+b);
    int data =0;
    
    if(a>=b)
      { int diff = a-b;
       //System.out.println("calling a larger");
       data= traverse(headA, diff, headB);
      }
    else
       { int diff = b-a;
         //System.out.println("calling b larger");
         data= traverse(headB, diff, headA);
       }
   // System.out.println("data at main:"+data);
return data;
}

int traverse(Node lhead, int diff, Node shead)
    {
    //System.out.println("diff:"+diff);
    //System.out.println();
    int data=0;
    Node lnode = lhead;
    Node snode = shead;
    for(int i=0; i< diff; i++)
        {
        if(lnode == null)
            {
            return -1;
        }
        lnode=lnode.next;
    }
    int c=0;
    while(lnode !=null && snode !=null)
        {
        
         if(lnode == snode)
             {
             data = lnode.data;
             break;//System.out.println("data:"+data);
         }
       c++;
            lnode = lnode.next;
            snode=snode.next;  
    }   
return data;
}

int countNode(Node head)
    {
    Node node = head;
    int count=0;
    while(node!=null)
        {
        count +=1;
        node=node.next;
    }
    return count;
}
