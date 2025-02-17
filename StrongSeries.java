package basics;

import java.util.Scanner;
public class StrongSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the First value:");
        int l = s.nextInt();
        System.out.print("Enter the Last value: ");
        int h = s.nextInt();
        int pos=0;
        for (int i = l; i <= h; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                int fact = 1;
                int r = temp % 10;
                for (int j = 1; j <= r; j++) {
                    fact *= j;
                }
                temp /= 10;
                sum += fact;
            }
            if (i == sum) {
                pos++;
                if(pos%3==0)System.out.println(i + " is Strong Number");
            }
        }
    }
}

