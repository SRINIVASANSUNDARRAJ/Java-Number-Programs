package basics;

public class Main{
    public static void main(String[] args) {
        String str="srinivasan";
        StringBuilder nstr= new StringBuilder();
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            nstr.insert(0, ch);
        }
        System.out.println(nstr);
        m1();
        System.out.println("My name is SRINIVASAN");

    }

    public static void m1() {
        System.out.println("my brother is vignesh");

    }
}
class A{

}
class B{

}