package first;

import java.util.Scanner;

public class DifferentStrings {
    //Четные и нечетные символы разделить по разным строкам
    public static void main(String[] args) {
        String evenNums = "";
        String oddNums = "";
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            int a = Integer.parseInt(String.valueOf(input.charAt(i)));
            if (a % 2 == 0) {
                evenNums += a + " ";
            } else {
                oddNums += a + " ";
            }
        }
        System.out.println(evenNums);
        System.out.println(oddNums);
    }
}
