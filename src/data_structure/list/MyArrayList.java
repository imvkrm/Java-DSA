import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList rendomItems = new ArrayList();// if we can add any datatype here

        rendomItems.add("Apple");
        rendomItems.add(23);

        System.out.println(rendomItems);

        ArrayList<String> names = new ArrayList<String>();// if we can add only String here

        names.add("Apple");
        // fruits.add(23); compile time error can't add int expect String

        System.out.println(names);

        List<String> fruits = new ArrayList<String>(); // List is an interface implemented by ArrayList we generally do
                                                       // it this way
        // becoz it type List object can be easily converted/perform operations with
        // Others type like Stack, Linklist etc
        // fruits is a List type object but actually it is object of ArrayList
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Kiwi");
        fruits.add("Grapes");
        fruits.remove(3);
        fruits.set(2, "Berry");

        System.out.println(fruits.get(2));

        System.out.println(fruits);

        List<String> toRemove = new ArrayList<>();
        toRemove.add("Grapes");
        toRemove.add("Orange");
        fruits.removeAll(toRemove);// remove a list of items
        System.out.println(fruits);
        System.out.println(fruits.contains("Grapes"));
        fruits.clear(); // clear the complete list
        System.out.println(fruits.size());

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");

        Object obj[] = fruits.toArray();// by default it is of type Object
        System.out.println(obj[0]);

        String temp[] = new String[fruits.size()];
        fruits.toArray(temp);

        System.out.println(temp[0]);

    }

}
