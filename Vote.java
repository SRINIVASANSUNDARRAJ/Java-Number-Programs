package basics;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        if(age>17) System.out.println("you are " +
                "eligible for vote");
        else System.out.println("you are not eligible");
    }
}
