package basics;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Range :");
        int n=sc.nextInt();
        int a=n+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1 || i+j==a) {
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
