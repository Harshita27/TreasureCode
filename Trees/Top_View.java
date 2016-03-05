/*
   class Node 
       int data;
       Node left;
       Node right;
*/
ArrayList<Integer> arrLeft = new ArrayList<Integer>();
ArrayList<Integer> arrRight = new ArrayList<Integer>();

void top_view(Node root)
{
  ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.addAll(addLeft(root.left));
    arr.add(root.data);
  arr.addAll(addRight(root.right));
    for(int i =0; i<arr.size(); i++)
        {
        System.out.print(arr.get(i) +" ");
    }
}

ArrayList addLeft(Node leftNode)
    {
    if(leftNode != null)
    {
    addLeft(leftNode.left);
    arrLeft.add(leftNode.data);
    //Collections.reverse(arrLeft);
    }
    return(arrLeft);
}
ArrayList addRight(Node rightNode)
    {
    if(rightNode != null)
    {arrRight.add(rightNode.data);
    addRight(rightNode.right);
    //Collections.reverse(arrRight);
    }
    return(arrRight);
}