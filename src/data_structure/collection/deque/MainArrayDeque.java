package deque;

import java.util.ArrayDeque;

public class MainArrayDeque {
    // Implemented as an Array
    // Can be used as a Stack or Queue
    // Can add/ remove element from both sides
    // Because it implement Stack, queue, dequeue so it has access to all there methods
    // It is faster than Stack becoz Stack use Vector which is Thread safe so make it slow
//Deque
    // Deque can be implemented as Array or LinkedList but ArrayDeque are better
    //offerFirst, pollFirst, peekFirst, offerLast, pollLast, peekLast (return null or false on error)
    //addFirst, removeFirst, getFirst,addLast, removeLast, getLast (throw exception on error)

public static void main(String[] args) {
    ArrayDeque<Integer> ad=new ArrayDeque<>();
    
    ad.addFirst(12);//as Deque
    ad.addLast(21);

    ad.add(125);//collection
    ad.push(23);//as stack
    ad.offer(43);//as queue
}

}
