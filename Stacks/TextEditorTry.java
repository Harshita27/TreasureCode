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
    public genType popEle()
        {
        genType ele = null;
        if(top != -1)
        {   ele = stackElem.get(top); 
            stackElem.remove(top);
             top--;
        }
        return ele;
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
        int n  = in.nextInt();
        StringBuilder st = new StringBuilder();
        stack<StringBuilder> stack1 = new stack<StringBuilder>();
        while(n>0)
            {
            if(in.hasNextInt())
                {
                if(stack1.getTop() != null)
                    {
                    st=stack1.getTop();
                }
                
                int code = in.nextInt();
               // System.out.println(code);
               // System.out.println(st);
                if(code ==1)
                    {
                    st.append(in.next());
                    stack1.push(st);  
                   }
                else if(code ==2)
                    {
                   int k = in.nextInt();
                    int s = st.length();
                  //  System.out.println("sub:"+st.substring(0,s-k));
                   st = new StringBuilder(st.substring(0,s-k));
                   stack1.push(st); 
                 }
                else if(code ==3)
                    {
                    int i = in.nextInt();
                    System.out.println((stack1.getTop()).charAt(i-1));
                }
                else 
                    if(code==4)
                    {
                        stack1.pop();
                    }
            }
            
            n--;
        }
    }
}