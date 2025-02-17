package basics;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        for(;;) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the year:");
            int years = sc.nextInt();
            for (int year = 1;year <= years;year++) {
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            System.out.println(year + " is Leap Year");
                        } //else System.out.println(year + "Not Leap Year");
                    } else System.out.println(year + " is Leap Year");
                } //else System.out.println(year + "Not BASICS.LeapYear ");
            }
        }
    }
}
