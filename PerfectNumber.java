package basics;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the low value ");
        int l = sc.nextInt();
        System.out.print("enter the high value ");
        int h = sc.nextInt();
        int pos=0;
        for (int j = l; j <= h; j++) {
            int sum = 0;
            for (int i = 1; i <= j / 2; i++) {
                if (j % i == 0) sum += i;
            }
            if (j == sum ) {
                pos++;
                //if(pos%3==0)
                System.out.println(j + " BASICS.PerfectNumber & third pos ");
            }
        }
    }
}