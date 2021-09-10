package vector_stack;

import java.util.Vector;

public class MainVector {
//Vector are Thread safe List i.e it has sync methods so if a thread call say add method then it will lock that method untill it's not done with the task so avoid other thread to use add method
//sync -> perform task one after another 
// Size of Vector will increase by 2 times as compare to Arraylist 1.5 times once thresold is reached so they take more space

// Apart from that Both ArrayList and Vectors are same

public static void main(String[] args) {
    Vector<Integer> v =new Vector<>();

    v.add(12);
    v.add(1);
    v.add(2);
}

    
}
