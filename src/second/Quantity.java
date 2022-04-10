package second;

import java.util.Scanner;

public class Quantity {
    //Количество цифр в строке
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        String string = sc.nextLine();
        String[] strings = string.split(" ");
        for (String str: strings) {
            try {
                Integer.parseInt(str);
                result++;
            } catch ( NumberFormatException e){

            }
        }
        System.out.println(result);
    }
}
