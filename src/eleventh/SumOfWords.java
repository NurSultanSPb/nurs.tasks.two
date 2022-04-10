package eleventh;

import java.util.Scanner;

public class SumOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s.replaceAll("[^a-zA-Z]", " ");
        String[] strings = s.split(" ");
        int res = strings.length;
        System.out.println(res);
    }
}
