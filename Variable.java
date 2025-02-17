package basics;

public class Variable {
    public static void main(String[] args) {
        calculator c=new calculator();
        System.out.println("BASICS.Addition       :" +c.addition(10,20));
        System.out.println("Subtraction    :" +c.subtraction(20,10));
        System.out.println("BASICS.Multiplication :" +c.multiplication(50,5));
        System.out.println("Division       :" +c.division(50,5));
    }
}
class calculator{
    public int addition(int a,int b) {
        return a+b;
    }
    public int subtraction(int a,int b){
        return a-b;
    }
    public int multiplication(int a,int b){
        return a*b;
    }
    public int division(int a,int b){
        return a/b;
    }
 }
