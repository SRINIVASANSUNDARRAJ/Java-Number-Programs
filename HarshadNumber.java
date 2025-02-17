package basics;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.print("Enter the Number :");
            int l = sc.nextInt();
            System.out.print("Enter the Number :");
            int h = sc.nextInt();
            int pos=0;
            for (int n =l;n<=h;n++) {
                int temp = n;
                int sum = 0;
                while (temp > 0) {
                    int a = temp % 10;
                    sum += a;
                    temp /= 10;
                }
                if (n % sum == 0  ) {
                    pos++;
                    if(pos%3==0)
                        System.out.println(n + " Harshad Number");
                }
            }
        }
    }
}