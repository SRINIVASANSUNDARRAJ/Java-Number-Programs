package basics;

import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range :");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        if (n == 1) {
            System.out.println(a);
            return;
        }
        System.out.print(a+" "+b);
        for(int i=3;i<=n;i++){
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
