package queue;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    //add, remove, element (throw exception on error)
    //offer, poll ,peek (return null or false on error)

    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();// Queue is abstract; cannot be instantiated so we will implement via LinkedList/ ArrayDeque/ PriortyQueue 
    q.add(12);
    q.offer(21);
    q.add(45);
    q.offer(54);

    System.out.println(q.remove());
    System.out.println(q.poll());

    System.out.println(q.element());
    System.out.println(q.peek());

    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

    MyQueue<Integer> mq=new MyQueue<>();

    mq.enqueue(12);
    mq.enqueue(21);
    mq.enqueue(45);
    mq.enqueue(54);

    System.out.println(mq.dequeue());
    System.out.println(mq.dequeue());
    
    }
}
