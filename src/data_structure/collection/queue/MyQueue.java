package queue;

import linked_list.MyLinkedList.Node;

public class MyQueue<E> {
    
    private Node<E> head,rear;

    public void enqueue(E e){// add to rear
        Node<E> toAdd =new Node<E>(e);
        if(head==null){
            head=rear=toAdd;
            return;
        }
        rear.next=toAdd;// assign the next
        rear=rear.next; // move the rear
    }

    public E dequeue(){// from head side
        if(head==null){
            return null;
        }
        Node<E> temp=head;
        head=head.next;
        if(head==null){// in case there is only one element
            rear=null;
        }
        return temp.data;

    }
}
