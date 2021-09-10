public abstract class Car {// we can't create instance of abstract becoz this is just a concept not the actual entity, but it's child will have to override it's concpt and add a body acording to child's requireent 
 abstract void accelerate();// abstract method
 abstract void breaks();// abstract method

 void honk(){// concreate method
     System.out.println("Car is honking");
 }
}
