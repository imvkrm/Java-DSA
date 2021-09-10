package vector_stack;

import java.util.Stack;

public class MainStack {
    //LIFO
    // It extends Vector (so it's recommended to use Stack as Dequeue)


    public static void main(String[] args) throws Exception {
        

        Stack<Integer> s=new Stack<Integer>();

        s.push(12);// add item
        s.push(42);
        s.push(15);
        s.push(2);
        
        int popped= s.pop(); // remove last item
        int peeked=s.peek(); // get the last item

       

       //System.out.println(peeked+"  "+popped);

       MyStack<Integer> ms=new MyStack<Integer>();

       ms.push(12);// add item
       ms.push(42);
       ms.push(15);
       ms.push(2);
       
       int mPopped= ms.pop(); // remove last item
       int mPeeked=ms.peek(); // get the last item

      

      System.out.println(mPeeked+"  "+mPopped);
    }
    
}
