package basics;

import java.util.Scanner;

public class ReverseSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int rev=0;
        while(num>0){
            int r=num%10;
            rev=(rev*10)+r;
            num/=10;
        }
        System.out.println("The reverse value:"+rev);
    }
}
