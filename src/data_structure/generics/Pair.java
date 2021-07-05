public class Pair <X,Y>{// here X Y is generics that is you can pass any type and the type is assign run time
    X x;
    Y y;

    Pair(X x,Y y){
        this.x=x;
        this.y=y;
    }

    void getDetails(){
        System.out.println(x+" - "+y);
    }
    
}
