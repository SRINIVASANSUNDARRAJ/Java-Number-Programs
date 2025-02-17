package basics;

import java.util.Scanner;
//BASICS.HappyNumber-Descending Order-Highest number
public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println();
                System.out.print("Enter the Number :");
                int l = sc.nextInt();
                System.out.print("Enter the Number :");
                int h = sc.nextInt();
                for (int n=h;n>=l;n--) {
                    int temp = n;
                    while (temp > 9) {
                        int sum = 0;
                        while (temp > 0) {
                            int a = temp % 10;
                            sum += (int) Math.pow(a, 2);
                            temp /= 10;
                        }
                        temp = sum;
                    }
                    if (temp == 1 || temp==7) {
                       System.out.println(n + " BASICS.HappyNumber");
                       break;
                    }
                }
            }
    }
}