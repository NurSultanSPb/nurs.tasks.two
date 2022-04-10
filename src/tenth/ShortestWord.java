package tenth;

import java.util.Scanner;

public class ShortestWord {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();
        String[] strings = s.split(" ");
        int min = 10000000;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < min) {
                min = strings[i].length();
            }
        }
        System.out.println(min);
    }
}
