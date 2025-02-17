package basics;

import java.util.Scanner;

public class Swap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a value :");
        int a= sc.nextInt();
        System.out.print("Enter the b value :");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The Swapped value a is :" + a +
                "\nThe Swapped value b is :" + b);

    }
}
