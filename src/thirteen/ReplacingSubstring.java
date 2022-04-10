package thirteen;

import java.util.Scanner;

public class ReplacingSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your text: ");
        String s = sc.nextLine();
        System.out.println("Type the substring to be changed: ");
        String subString = sc.next();
        System.out.println("Type the new one: ");
        String newSubString = sc.next();
        String newS = s.replaceAll(subString, newSubString);
        System.out.println(newS);
    }
}
