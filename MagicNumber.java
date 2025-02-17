package basics;

import java.util.Scanner;
//BASICS.MagicNumber - Descending order for given range
public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.print("Enter the number :");
            int n = sc.nextInt();
                int temp = n;
                while (temp > 9) {
                    int sum = 0;
                    while (temp > 0) {
                        int a = temp % 10;
                        sum += a;
                        temp /= 10;
                    }
                    temp = sum;
                }
                if (temp == 1 ) {
                    System.out.println(n + " Is BASICS.MagicNumber");
                }else System.out.println(n+" Is Not BASICS.MagicNumber");
            }
        }
    }