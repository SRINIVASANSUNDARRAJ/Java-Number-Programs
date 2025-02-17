package basics;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first(a) number :");
            int a = sc.nextInt();
            System.out.print("Enter the second(b) number :");
            int b = sc.nextInt();
            int c = a;
            a = b;
            b = c;
            System.out.println("The Swapped value a is :" + a +
                    "\nThe Swapped value b is :" + b);
        }
    }
}