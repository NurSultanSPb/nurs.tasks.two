package ninth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfStirngs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] array = s.split(" ");
        String result = "";
        char firstChar = 1300;
        for (int i = 0; i < array.length; i++) {
            char c = array[i].toLowerCase().charAt(0);
            for (int j = 0; j < array.length; j++) {
                    char b = array[j].toLowerCase().charAt(0);
                    if (c < b) {
                        firstChar = c;
                    } else {
                        firstChar = b;
                    }
            }
            if (firstChar == c) {
                result += array[i];
            }
        }
        System.out.println(result);
    }
}
