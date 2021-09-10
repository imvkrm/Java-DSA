import java.util.HashSet;
import java.util.Set;

public class MainSetClass {

    // Avoid duplicate elements
    // Interneally it uses HashMap
    // Perform opertions like add, remove etc in constant time

    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();

        mySet.add("Apple");
        mySet.add("Kiwi");
        mySet.add("Banana");
        System.out.println(mySet.add("Orange"));//return true becoz Orange is not present in the set

        System.out.println(mySet.add("Kiwi"));//return false becoz Kiwi is already there in the set

        System.out.println(mySet);
    }

}
