package fifth;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            int counter = 0;
            char c = chars[i];
            for (int j = 0; j < chars.length; j++) {
                    if (c == chars[j]) {
                        counter++;
                    }
            }
            System.out.println("Char " + c + " we can see in this string " + counter + " times.");
        }
    }
}
