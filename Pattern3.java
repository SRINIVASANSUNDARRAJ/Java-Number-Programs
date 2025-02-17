package basics;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range:");
        int n = sc.nextInt();
        int space = n - 1;
        int star = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= star; k++) {
                if(k==1||i==n||k==star){
                System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            star += 2;
            space = space-1;
            System.out.println();
        }
    }
}

