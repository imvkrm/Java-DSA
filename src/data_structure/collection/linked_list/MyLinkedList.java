package linked_list;

public class MyLinkedList<E> {

    Node<E> head;// first Node

   public void add(E data) {
        Node<E> toAdd = new Node<>(data);
        if (isEmpty()) {
            // If the list is empty
            head = toAdd;
            return;
        }

        Node<E> temp = head;
        while (temp.next != null) {// itrating to last item
            temp = temp.next;
        }
        temp.next = toAdd;// add item at the last of list

    }

    public  boolean isEmpty() {
        return head == null;
    }

    public E removeLast() throws Exception {
        Node<E> temp = head;
        if (temp == null) {
            throw new Exception("Can't remove element from empty list");
        }

        if (temp.next == null) {
            Node<E> toRemove = head;
            head = null;

            return toRemove.data;
        }

        while (temp.next.next != null) {
            temp = temp.next;
        }

        Node<E> toRemove = temp.next;
        temp.next = null;

        return toRemove.data;
    }

    public  E getLast() throws Exception {
        Node<E> temp = head;
        if (temp == null) {
            throw new Exception("Can't get element from empty a list");
        }

        while (temp.next != null) {
            temp = temp.next;
        }

        return temp.data;
    }

    void printList() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
    }

  public  static class Node<E> {
      public  E data;// current node data
      public  Node<E> next;// next node reference

        public Node(E data) {
            this.data = data;
            next = null;
        }
    }

}
