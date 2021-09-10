public class Person {
    protected String name;

    Person(String name) {// default constructor overload
        this.name = name;
        System.out.println("Person constructor "+name); 
    }

    void eat() {
        System.out.println("Person " + name + " is Eating");
    }

    void walk() {
        System.out.println(name + " is Walking");
    }

}
