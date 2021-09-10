public class MainClassGenerics {
    
    public static void main(String[] args) {
       
        Pair<String,String> p1=new Pair<String,String>("Name","Vikram");
        Pair<String,Integer> p2=new Pair<String,Integer>("RollNo",23);
// Integer is a wraper class around int primitive type same goes for double becoz generic needs object of class and primitive type doesn't extends object class


        p1.getDetails();
        p2.getDetails();

    }
}
