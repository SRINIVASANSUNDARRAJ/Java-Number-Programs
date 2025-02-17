package basics;

public class Recursion {
    public static void main(String[] args) {

        Recursion.m1(1);
    }

    public static void m1(int i){
        System.out.println(i);
        if(i>=4) return;
        m1(i+1);
        m1(i+1);
        m1(i+1);
        System.out.println(i);
    }
}
