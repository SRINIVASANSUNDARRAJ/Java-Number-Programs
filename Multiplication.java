package basics;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number for BASICS.Multiplication:");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<11;i++){
            sum=num*i;
            System.out.println(i+"x"+num+"="+sum);
        }
    }
}
