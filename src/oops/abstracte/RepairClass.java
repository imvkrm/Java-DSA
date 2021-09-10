public class RepairClass {

    // static void repairCar(Audi car){  
    //     System.out.println("Car gets repaired");
    //         }

    //         static void repairCar(Nexon car){
    //             System.out.println("Car gets repaired");
    //                 }

// We don't need to create sepate menthod for same task using abstract

            static void repairCar(Car car){
                System.out.println("Car gets repaired");
                    }

  // Encapsulation - data hiding for security reasons (to avoid anauthorize access)
  // Abstraction- data hiding for reducing complexity (user has nothing to do with process but only result)

   public static void main(String[] args) {
       Nexon nexon=new Nexon();
       Audi audi=new Audi();

       repairCar(nexon);
       repairCar(audi);
   } 
}
