public class Singer extends Person {
 
    Singer(String name) {//because Person class has a overloaded constructor
        super(name);
        System.out.println("Singer constructor "+name);
    }
    void sing(){
        System.out.println(name+ " is Singing");
    }
    //override
    void eat(){
        super.eat();//call eat method of parent class
        System.out.println("Singer "+name+" is Eating");
    }

    
}
