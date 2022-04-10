package fourteen;

import java.util.Scanner;

public class DistanseBetweenStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the text: ");
        String s = sc.nextLine();
        System.out.println("Type the first substring: ");
        String firstSubStr = sc.next();
        System.out.println("Type the second substring: ");
        String secondSubStr = sc.next();
        int first = s.indexOf(firstSubStr);
        int second = s.indexOf(secondSubStr);
        int distanceBetweenStrings = 0;
        if (first != -1 && second != -1) {
            distanceBetweenStrings = Math.abs(second - first - firstSubStr.length());
            System.out.println("The distance between strings is " + distanceBetweenStrings);
        } else {
            System.out.println("One of substrings in the string doesn't exist");
        }
    }
}
