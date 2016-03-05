   /*
    
    class Node 
       int data;
       Node left;
       Node right;
   */
int h = 0;
   int height(Node root)
    {
         if(root == null)
             h =0;
       else
           {
           h = Math.max((height(root.left)+1), (height(root.right) +1));
       }
       return h;
    }
