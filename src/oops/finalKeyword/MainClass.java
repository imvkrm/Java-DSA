public class MainClass extends Details{

  @Override
  public void getName(){
    System.out.println("Main class getName");
  }
// can't override a final method
  // public void getdescription(){ 
  //  // System.out.println("Main class getName");
  // }
  
    final int ROLL_NO=4;// final variable must be intialise
   
    public static void main(String[] args) {
   

       Student obj=new Student();
       Student obj1=new Student();
      final Student obj2=new Student();

       obj=obj1;// assign refernce of obj1 to obj
     //  obj2=obj;//error can't change a final refernce but below will work

     obj2.NAME="Karan"; // but we can still change the non-final variables value

    }
}
