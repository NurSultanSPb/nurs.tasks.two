package twelve;

import java.util.Scanner;

public class PalindromChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        boolean isPalindrome = s.equals(stringBuilder.toString());
        System.out.println("Is this string is palindrome " + s + ": "+ isPalindrome);
    }
}
