package basics;

public class InheritanceConstructor {
    public static void main(String[] args) {
        Y y = new Y(5);
    }
}
class X{
    X(){
        System.out.println("A");
    }
}
class Y extends X{
    Y(){
        System.out.println("y constructor");
    }
    Y(int x){
        this();
        System.out.println("Y argument");
    }
}