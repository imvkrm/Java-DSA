
class StaticKeyword {

    static {
        System.out.println("Will be used to excecute initallly(before main method) to init variable/methods");
    }

    public static void main(String[] args) {

        A aObj = new A();
        A.B bObj = aObj.new B();// non static class tightly couple

        A.C cObj = new A.C();// static class losely couple
    }
}