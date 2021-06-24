package oops;

class Dog {// blueprint-> don't take any memory
    String name; // property/ state
    String color;
    String breed;
    

    Dog(String breed){// becoz we have created a constructor so we now can't call the default constructor
        this.breed=breed;// here 'this'is pointing to current object
    }

    void eat(String food) { // method / behaviour
        food = "Bread";
        System.out.println("My dog " + name + " is eating " + food);
    }

}

public class MainClass {

    public static void main(String[] args) {
        Dog dog = new Dog("Indian"); // An instance of dog class ->memory is assigned in heap
        dog.name = "Ronie";
        String food = "Roti";
        dog.eat(food);// Java is always pass by value
        System.out.println(food);

        Dog a = new Dog("Indian");
        Dog b = new Dog("Indian");

        swap(a, b);// call by value becoz reference of a and b doesn't change

        Dog c = new Dog("Indian");
        c.color = "White";
        change(c);
        System.out.println(c.color);//color will be 'black' not 'White' c and c1 both pointing to same memory  

        

    }

    static void change(Dog c1) {
        c1.color = "black";
    }

    static void swap(Dog a1, Dog b1) {
        Dog temp = a1;
        a1 = b1;
        b1 = temp;

        // a1 is pointing to b1 and b1 to a1 but a and b still poiting to same memory
    }

}
