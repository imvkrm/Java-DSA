package deque;

public class MyDeque<E> {//Using Doubly LinkedList

    Node<E> head,tail;

    public void addToHead(E e){
        Node<E> toAdd=new Node<>(e);
        if(head==null){
            head=tail =toAdd;
        }

        head.next=toAdd;
        toAdd.prev=head;
        head=toAdd;
    }

    public E removeFromTail(){

        if(head==null){
            return null;
        }
        Node<E> toRemove=tail;

        tail=tail.next;
        tail.prev=null;
        if(tail==null){
            head=null;
        }

        return toRemove.data;
    }


    public static class Node<E> {
        E data;
        Node<E> prev, next;

        Node(E e) {
            this.data = e;
            this.prev = this.next = null;
        }

    }

}
