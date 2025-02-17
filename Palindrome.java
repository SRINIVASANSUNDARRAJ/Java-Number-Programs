package basics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String :");
            String input = sc.nextLine();
            boolean isPalindrome = true;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            System.out.println(isPalindrome ? "BASICS.Palindrome" : "Not BASICS.Palindrome");
        }
    }
}
