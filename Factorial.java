package basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int fact=1;
        if(num==0) {
            System.out.println("BASICS.Factorial =" + fact);
            return;
        }

        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("factorial ="+fact);
    }
}
