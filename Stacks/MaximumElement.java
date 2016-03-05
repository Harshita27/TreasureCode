import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class stack<genType>
    {
    ArrayList<genType> stackElem;
    int top = -1;
    
    public stack()
        {
        stackElem = new ArrayList<genType>();
    }
    
    public void push(genType obj)
        {
        stackElem.add(obj);
        top++;
    }
    
    public void pop()
        {
        if(top != -1)
        {    stackElem.remove(top);
             top--;
        }
    }
    
    public genType getTop()
        {
        if(top != -1)
            return stackElem.get(top);
        else
            return null;
    }
    
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       // System.out.print(in.next());
        stack<Integer> stack1 = new stack<Integer>();
        stack<Integer> stack2 = new stack<Integer>();
        while(n>0)
           {
            {if(in.hasNextInt())
                {
          // System.out.println("line");
         /* */
                int code = in.nextInt();
              if(code == 1)
            {
                  
                  int input = in.nextInt();
                //  System.out.println(input+"push");
                  stack1.push(input);
                  if(stack2.getTop() != null)
                      {
                      if(stack2.getTop() < input)
                          {
                          stack2.push(input);
                      }
                      else
                          stack2.push(stack2.getTop());
                  }
                  else
                      stack2.push(input);
                  
              }
           else if(code ==2)
                {
              //  System.out.println("pop");
                stack1.pop();
                stack2.pop();
            }
            else if(code == 3)
                {
                System.out.println(stack2.getTop());
            }
     //   n--;
            }}
        n--;}
    }}