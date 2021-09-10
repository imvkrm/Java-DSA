package linked_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MaiinLinkedList {
    
    public static void main(String[] args) {
      
        List<Integer> ll=new LinkedList<>();
        List<Integer> al=new ArrayList<>();

        getTimeDiff(ll);// take less time in insertion and deletion
        getTimeDiff(al); // take less time in fetching data

        // can use all the methods of List
        // ll.add(12);
        // ll.add(2);
        // ll.add(1);

        // ll.toArray();

      //  System.out.println(ll.get(1));

      MyLinkedList myLinkedList=new MyLinkedList();

      myLinkedList.add(12);
      myLinkedList.add(2);
      myLinkedList.add(13);
      myLinkedList.add(17);
      myLinkedList.printList();


    }

    static void getTimeDiff(List<Integer> list){
        long start =System.currentTimeMillis();

        for(int i=0;i<100000;i++){
            list.add(0,i);
        }

        long end =System.currentTimeMillis();

        System.out.println(list.getClass().getName()+" -->"+ (end-start));

    }
}
