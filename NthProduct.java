package basics;

import java.util.Scanner;

public class NthProduct {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the range:");
        int num=sc.nextInt();
        int prod=1;
        for(int i=1;i<=num;i++){
            prod=prod*i;
        }
        System.out.println("The product of "+num+"th digit: "+prod);
    }
}
