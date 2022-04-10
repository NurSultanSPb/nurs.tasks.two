package eighth;

import java.util.Scanner;

public class ReversingTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] array = s.split(" ");
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result += array[i] + " ";
        }
        System.out.println(result.trim());
    }
}
