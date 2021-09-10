package vector_stack;

import linked_list.MyLinkedList;

public class MyStack<E> {

    private MyLinkedList<E> mll=new MyLinkedList<>();

    void push(E e){
     mll.add(e);
    }

    E pop() throws Exception{
        if(mll.isEmpty()){
            throw new Exception("Can't Pop from empty stack");
        }

       return mll.removeLast(); 

    }

    E peek()throws Exception{
        if(mll.isEmpty()){
            throw new Exception("Can't Peek from empty stack");
        }

       return mll.getLast(); 

    }

    
}
