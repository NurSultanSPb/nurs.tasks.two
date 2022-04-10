package sixth;

import java.util.Scanner;

public class Reversing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
