public class Teacher extends Person {

    Teacher(String name) {//because Person class has a overloaded constructor
        super(name);
        System.out.println("Teacher constructor "+name);
    }

    void teach(){
        System.out.println(name+" is Teaching");
    }

    //override
    void eat(){
        super.eat();//call eat method of parent class

        System.out.println("Teacher "+name+" is Eating");
    }
    
}
