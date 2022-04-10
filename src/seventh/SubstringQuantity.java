package seventh;

import java.util.Scanner;

public class SubstringQuantity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String subString = sc.next();
        String[] strings = string.split(subString);
        int result = strings.length - 1;
        System.out.println(result);
    }
}
