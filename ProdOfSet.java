package basics;

import java.util.Scanner;

public class ProdOfSet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range:");
        int num=sc.nextInt();
        int digit=0;int prod=1;
        while(num>0){
            int r=num%10;
            prod*=r;
            num/=10;
        }
        System.out.println(prod+" is the product of set");
    }
}
