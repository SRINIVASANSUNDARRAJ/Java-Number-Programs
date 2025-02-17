package basics;

public class Constructor {
    //BASICS.Constructor Overloading
    public static void main(String[] args) {
        System.out.println("Order Of Occurrence of Argument");
        System.out.println("----------------------");
        new C('i');
        new C(10f,"hello");
        new C(10,32f);
        new C(12d,'g');
    }
}
class C{
    public C(float f,String s){
        System.out.println("Float "+f+" String "+s);
    }
    public C(double d,char c){
        System.out.println("Double "+d+" char "+c);
    }
    public C(char c){
        System.out.println("Character "+c);
    }
    public C(int j,float m){
        System.out.println("Integer "+j+" Float "+m);
    }
    public C(){
        //default-constructor
    }

}