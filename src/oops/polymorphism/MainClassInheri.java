public class MainClassInheri {
    
    
    public static void main(String[] args) {
        Dog d=new Dog();

        Pet p=d;
       // Animal a=d;

        d.walk();
        p.walk();// Run Time Polymorphism (Overrding) - we don't know on compile time which walk will call
       

        System.out.println(d.name);
        System.out.println(p.name);// variables never override

       greetings();
       greetings("Welcome");// Compile Time Polymorphism (Overloading) - we know on compile time which walk will call


    }

    public static void greetings(){
        System.out.println("Hi,there");
    }

    public static void greetings(String msg){
        System.out.println(msg);
    }

}
