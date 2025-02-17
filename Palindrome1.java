package basics;

import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value:");
        int l = sc.nextInt();
        int h = sc.nextInt();
        for (int i = h; i >= l; i--) {
            //int n = i;
            int temp = i;
            int rev = 0;
            while (temp > 0) {
                int r = temp % 10;
                rev = (rev * 10) + r;
                temp /= 10;
            }

            if (rev == i){

                    System.out.println(i+" BASICS.Palindrome");
                    return;

            }

        }

    }
}