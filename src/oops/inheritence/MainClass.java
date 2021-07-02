public class MainClass {

    // Java doesn't support multiple inheritence becoz of Diamond Problem -that is two classes may define
    // different ways of doing the same things, and subclass can't choosw which one to pick 

    public static void main(String[] args) {

        Teacher t = new Teacher("Mr. Dubey");
        // t.name = "Mr. Dubey";// from parent(Person)
        t.eat();// from parent(Person)
        t.teach(); // from itself (Teacher)

        Singer s = new Singer("Raj");
        // s.name = "Raj";// from parent(Person)
        s.eat();// from parent(Person)
        s.sing();// from itself (Singer)

        Person p = new Teacher("Mr.Malhi"); // up casting
        // p.name = "Mr.Malhi";
        p.eat();
        // p.teach();// error parent(here p) can't access its child methods

        System.out.println(p instanceof Person);
        System.out.println(p instanceof Teacher);
        // p is intance of both Person and Teacher

        // Teacher t1 = (Teacher) new Person();// down casting
        // Run time error ClassCastException- class Person cannot be cast to class
        // Teacher
        // t1.name = "Mrs Malhi";
        // t1.eat();
        // t1.teach();

        Teacher t2 = (Teacher) p;// down casting - fine because p was upcast to person but actually p is teacher
        t2.name = "Ms Shukhi";
        t2.eat();
        t2.teach();// because it's Teacher instance so it will work fine

    }

}
