import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class MainPriortyQueue {
    // addition is one after another but removale is on the priorty basis
    public static void main(String[] args) {


        
        PriorityQueue<String> pq=new PriorityQueue<>();
        
        pq.add("Kiwi");
        pq.add("Apple");
        pq.add("Orange");
        pq.add("Banana");
        pq.add("Mango");

       
   


        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        
        
    }
}
