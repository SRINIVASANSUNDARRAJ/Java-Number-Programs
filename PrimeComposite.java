package basics;

import java.util.Scanner;

public class PrimeComposite {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The Number:");
            int num_min = sc.nextInt();
            int num_max = sc.nextInt();
            for (int num = num_min; num <= num_max; num++) {
                PrimeComposite.pC(num);
            }
        }
    }
    public static void pC(int num) {
        if (num <= 0) System.out.println(num+" Enter valid number");
        if (num == 1) System.out.println(num+" neither prime nor composite");
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    //System.out.println(num+" composite");
                    return;
                }
            }
            System.out.println(num+" Prime number");
            return;
        }
    }

}
